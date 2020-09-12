package sd.sym.codingcompete.codechef.compete.hackon_feb.praveen;

import java.util.Scanner;

public class Praveen
{
  public static int[] solve()
  {
    boolean[] arr=new boolean[1000001];
    arr[0]=true;
    arr[1]=true;
    //for(int i=2;i<=1000000;i++)
    //arr[i]=false;
    for(int i=2;i<=1000000;i++)
    {
      if(!arr[i])
      {
        for(int j=2;i*j<=1000000;j++)
        {	System.out.println(i*j);
        arr[i*j]=true;
        }
      }
    }
    int[] freq=new int[1000001];
    int sum=0;
    for(int i=0;i<freq.length;i++)
    {
      if(!arr[i]) {
        sum++;
      }
      freq[i]=sum;
    }
    // for(int i=0;i<100;i++)
    //     if(!arr[i])
    //         System.out.println(i);
    return freq;
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] arr=solve();
    while(t-->0)
    {
      int l=sc.nextInt();
      int r=sc.nextInt();
      double ans=(arr[r]-arr[l-1])/(double)(r-l+1);
      System.out.printf("%6f",ans);
      System.out.println();
    }
    sc.close();
  }
}

/*import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Praveen {

	public static int[] strArr = new int[1000000];

	private static final int MYTHREADS = 1000000;

	public static void main(String args[]) throws Exception
	{
		final int terms = 50000;
		final int maxFetch = 1000000;

		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		for (int startPoint = 2; startPoint <  maxFetch ; startPoint += terms) {
			Runnable worker = new MyRunnable(startPoint , startPoint+terms);
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}

		Scanner lea = new Scanner(System.in);
		int testCases = lea.nextInt();
		for (int i = 0; i < testCases; i++)
		{
			primeProbablity(lea.nextInt(),lea.nextInt(),strArr);
		}
		lea.close();

	}

	public static class MyRunnable implements Runnable {
		private final int startPoint;
		private final int endPoint;

		MyRunnable(int startPoint , int endPoint) {
			this.startPoint = startPoint;
			this.endPoint = endPoint;
		}

		@Override
		public void run()
		{
			int terms = 1000;
			ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
			for (int i = startPoint ; i < endPoint ; i=i+terms) {
				Runnable worker = new MyRunnableA(i , i+terms);
				executor.execute(worker);
			}
			executor.shutdown();
			// Wait until all threads are finish
			while (!executor.isTerminated()) {

			}

		}
	}

	public static class MyRunnableA implements Runnable {
		private final int startPoint;
		private final int endPoint;

		MyRunnableA(int startPoint , int endPoint) {
			this.startPoint = startPoint;
			this.endPoint = endPoint;
		}

		@Override
		public void run() {
			for (int i1 = startPoint ; i1 < endPoint; i1++ )
			{
				if(i1%2==1)
					if(isPrime(i1))
						strArr[i1] = 1 ;
			}

		}


	}
	public static void main(String[] args) throws InterruptedException
	{
		Scanner lea = new Scanner(System.in);

		List<Thread> listThread = new ArrayList<Thread>();
		ss
		int terms = 10000;

		for (int i = 2; i < strArr.length; )
		{

			final int ii = i ;
			Runnable r = new Runnable()
			{

				@Override
				public void run()
				{

					for (int i1 = ii; i1 < ii+terms; i1++ )
					{
						if(isPrime(i1))
						{
							strArr[i1] = 1 ;
						}
					}
				}
			};
			Thread t = new Thread(r);
			t.setName("Thread_Mera_"+i);

			t.start();

			listThread.add(t);




			i  = i + terms;


		}

		for (int ix = 0; ix < listThread.size(); ix++)
        {
			listThread.get(ix).join();
        }


		int testCases = lea.nextInt();
		for (int i = 0; i < testCases; i++)
		{
			primeProbablity(lea.nextInt(),lea.nextInt(),strArr);
		}
		lea.close();
		System.exit(0);
	}

	private static void primeProbablity(int n, int k , int[] intArray)
	{
		double count = 0 ;
		for (int i = n; i <= k; i++)
		{
			count += intArray[i];
		}

		System.out.println(String.format("%.6f", (count/(Math.abs(k-n+1)))));
	}

	private static boolean isPrime(double i)
	{
		for (double j = 2; j < i; j++)
		{
			if(j%i==0 || i%j==0)
			{
				return false;
			}
		}
		return true;
	}

}
 */