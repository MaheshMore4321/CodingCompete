package sd.sym.codingcompete.codechef.beginner.add_two_numbers;

import java.util.Scanner;

public class AddTwoNumbers
{
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n ; i++)
    {
      System.out.println(sym.nextInt() + sym.nextInt() );
    }
    sym.close();
  }
}
