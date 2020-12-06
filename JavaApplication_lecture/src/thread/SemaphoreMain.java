package thread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {
  public static void main(String args[]) throws Exception {
    Semaphore sem = new Semaphore(3);
    Thread thrdA = new Thread(new SemaphoreThread(sem, "Message 1"));
    Thread thrdB = new Thread(new SemaphoreThread(sem, "Message 2"));
    Thread thrdC = new Thread(new SemaphoreThread(sem, "Message 3"));
    Thread thrdD = new Thread(new SemaphoreThread(sem, "Message 4"));

    thrdA.start();
    thrdB.start();
    thrdC.start();
    thrdD.start();

  }
}

