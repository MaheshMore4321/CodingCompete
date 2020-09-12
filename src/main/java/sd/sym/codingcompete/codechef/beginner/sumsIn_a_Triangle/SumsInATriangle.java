package sd.sym.codingcompete.codechef.beginner.sumsIn_a_Triangle;

import java.util.Scanner;

class SumsInATriangle
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int ntimes = sym.nextInt();
    for(int t = 1 ; t <= ntimes ; t++ )
    {
      int n = sym.nextInt();
      int arr[][] = new int[n][n];
      for(int i = 0 ; i < n ; i++ ) {
        for(int j = 0 ; j <= i ; j++ ) {
          arr[i][j]=sym.nextInt();
        }
      }

      for(int i = n-1 ; i > 0 ; i-- )
      {
        for(int j = 0 ; j < n-1 ; j++ )
        {
          int pointA = arr[i-1][j] + arr[i][j];
          int pointB = arr[i-1][j] + arr[i][j+1];
          if( pointA > pointB ) {
            arr[i-1][j] = pointA;
          } else {
            arr[i-1][j] = pointB;
          }
        }
      }
      System.out.println(arr[0][0]);
    }
    sym.close();
  }
}

/*

int T = sc.nextInt();

for(int t=0 ; t<T ; t++)
{
  int n = sc.nextInt();
  int arr[][] = new int[n][n];

  for(int i=0 ; i<n ; i++)
    for(int j=0 ; j<=i ; j++)
      arr[i][j] = sc.nextInt();

  for(int i=n-1 ; i>0 ;i--)
  {
  for(int j= 0 ; j<n-1 ; j++)
    {
    int abv = arr[i-1][j];
    int k1 = abv + arr[i][j];
    int k2 = abv + arr[i][j+1];

    if(k1>k2)
      arr[i-1][j] = k1;
    else
      arr[i-1][j] = k2;
    }
}
System.out.println(arr[0][0]);
}

 */