package sd.sym.codingcompete.codechef.beginner.reverse_the_number;

import java.util.Scanner;

class ReverseTheNumber
{
  public static void main(String[] args)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++)
    {
      String str = sym.next();
      String reverseStr = "" ;
      for (int j = str.length() - 1 ; j >= 0 ; j--)
      {
        reverseStr = reverseStr + str.charAt(j) ;
      }
      System.out.println(Integer.parseInt(reverseStr));
    }
    sym.close();
  }
}