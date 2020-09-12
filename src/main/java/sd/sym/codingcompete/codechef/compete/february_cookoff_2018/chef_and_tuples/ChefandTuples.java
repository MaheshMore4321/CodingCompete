package sd.sym.codingcompete.codechef.compete.february_cookoff_2018.chef_and_tuples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChefandTuples
{
  static MyScanner scan;
  static PrintWriter pw;
  static int n,a,b,c;
  public static void main(String[] args) {
    new Thread(null,null,"_",1<<25)
    {
      @Override
      public void run()
      {
        try
        {
          solve();
        }
        catch(Exception e)
        {
          e.printStackTrace();
          System.exit(1);
        }
      }
    }.start();
  }
  static void solve() throws IOException
  {
    scan = new MyScanner();
    pw = new PrintWriter(System.out,true);
    int t = ni();
    while(t-->0)
    {
      n = ni();
      a = ni();
      b = ni();
      c = ni();
      //ArrayList<Integer> div = new ArrayList();
      long res = 0;
      for(int i=1;i*i<=n;++i)
      {
        if(n%i==0)
        {
          if(i*i==n)
          {
            if(i<=c) {
              res+=f(i);
            }
          }
          else
          {
            if(n/i<=c) {
              res+=f(i);
            }
            if(i<=c) {
              res+=f(n/i);
            }
          }
        }
      }
      pl(res);
    }
    pw.flush();
    pw.close();
  }
  static int f(int N)
  {
    int cnt = 0;
    for(int i=1;i*i<=N;++i)
    {
      if(N%i==0)
      {
        if(i*i==N)
        {
          if(i<=a && i<=b) {
            ++cnt;
          }
        }
        else
        {
          if(i<=a && N/i<=b) {
            ++cnt;
          }
          if(N/i<=a && i<=b) {
            ++cnt;
          }
        }
      }
    }
    return cnt;
  }
  static int ni() throws IOException
  {
    return scan.nextInt();
  }
  static long nl() throws IOException
  {
    return scan.nextLong();
  }
  static double nd() throws IOException
  {
    return scan.nextDouble();
  }
  static String ne() throws IOException
  {
    return scan.next();
  }
  static String nel() throws IOException
  {
    return scan.nextLine();
  }
  static void pl()
  {
    pw.println();
  }
  static void p(Object o)
  {
    pw.print(o+" ");
  }
  static void pl(Object o)
  {
    pw.println(o);
  }
  static void psb(StringBuilder sb)
  {
    pw.print(sb);
  }
  static class MyScanner
  {
    BufferedReader br;
    StringTokenizer st;
    MyScanner()
    {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
    String nextLine()throws IOException
    {
      return br.readLine();
    }
    String next() throws IOException
    {
      if(st==null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }
    int nextInt() throws IOException
    {
      return Integer.parseInt(next());
    }
    long nextLong() throws IOException
    {
      return Long.parseLong(next());
    }
    double nextDouble() throws IOException
    {
      return Double.parseDouble(next());
    }
  }
}


/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefandTuples {

	public static void main(String[] Sym) {
		Scanner sym = new Scanner(System.in);
		int times = sym.nextInt();
		for (int i = 0; i < times; i++) {
			int amt = sym.nextInt();
			int n = sym.nextInt();
			int k = sym.nextInt();
			int l = sym.nextInt();
			makeAnalysis(amt,minCompu(amt,n),minCompu(amt,k),minCompu(amt,l));
		}
		sym.close();
	}

	private static void makeAnalysis(int amt, Integer[] n, Integer[] k, Integer[] l) {
		int count = 0 ;
		for (int i = 1; i < n.length; i++) {
			for (int j = 1; j < k.length; j++) {
				for (int j2 = 1; j2 < l.length; j2++) {
					if( n[i]*k[j]*k[j2]==amt){
						//System.out.println(i+" "+j+" "+j2);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	private static Integer[] minCompu(int a , int b) {
		List<Integer> al=new ArrayList<Integer>();
		for(int i= 1 ;i<=b;i++)
		    {
		        if(b%i==0)
		           al.add(i);
		    }
		return al.toArray(new Integer[al.size()]);
	}
}*/
