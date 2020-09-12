package sd.sym.codingcompete.codechef.beginner.firstand_last_digit;

import java.util.Scanner;

class FirstandLastDigit
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++)
    {
      String str = sym.next();
      System.out.println(Integer.parseInt(str.charAt(0)+"")+Integer.parseInt(str.charAt(str.length()-1)+""));
    }
    sym.close();
  }
}
