package sd.sym.codingcompete.codechef.beginner.turbo_sort;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int times = sym.nextInt();
    int[] intarr = new int[times];
    for (int i = 0; i < times; i++)
    {
      intarr[i] = sym.nextInt();
    }
    Arrays.sort(intarr);
    for (int element : intarr) {
      System.out.println(element);
    }
    sym.close();
  }
}
