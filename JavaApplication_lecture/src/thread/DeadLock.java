package thread;

public class DeadLock
{
   private Object lock1 = new Object();
   private Object lock2 = new Object();
   void instanceMethod1()
   {
      synchronized(lock1)
      {
         synchronized(lock2)
         {
            System.out.println("first thread in instanceMethod1");
         }
      }
   }
   void instanceMethod2()
   {
      synchronized(lock2)
      {
         synchronized(lock1)
         {
            System.out.println("second thread in instanceMethod2");
         }
      }
   }
}

