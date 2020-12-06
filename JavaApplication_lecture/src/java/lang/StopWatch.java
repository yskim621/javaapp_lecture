package java.lang;

class StopWatch
{
	public static void main(String args[]) 
	{
		long start, end;
		int ar [] = new int [10000];
		//1970년 1월 1일부터 현재까지의 시간을 나노 초로 반환
		start = System.nanoTime();
		System.out.println("10000회의 Loop를 반복 시작" );
		int cnt = ar.length;
		for(int i=0; i <cnt ; i++)
		{
			System.out.println(ar[i]);
		}
		end = System.nanoTime(); 
		System.out.println("10000회 반복에 소요된 시간 : " + ( (((double)end -start)/1000000000)+ "초" ));
	}
}
