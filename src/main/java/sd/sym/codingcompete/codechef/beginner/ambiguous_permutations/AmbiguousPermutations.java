package sd.sym.codingcompete.codechef.beginner.ambiguous_permutations;

import java.util.Scanner;

class AmbiguousPermutations
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    while(true)
    {
      int n = sym.nextInt();

      if(n==0) {
        break;
      }

      int[] sampleset = new int[n+1];
      int[] checkset = new int[n+1];
      for (int i = 1; i < n+1 ; i++)
      {
        int val = sym.nextInt();
        sampleset[i] =  val;
        checkset[val] = i;
      }

      boolean flag = false;
      for (int i = 1; i < n+1 ; i++)
      {
        if(checkset[i]!=sampleset[i])
        {
          flag = true;
        }
      }

      if(flag) {
        System.out.println("not ambiguous");
      } else {
        System.out.println("ambiguous");
      }
    }
    sym.close();
  }
}