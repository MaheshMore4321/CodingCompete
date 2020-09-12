package sd.sym.codingcompete.codechef.beginner.atm;

import java.util.Scanner;

public class ATM
{
  public static void main (String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int amount = sym.nextInt();
    double balance = sym.nextDouble();

    if ( amount > 0         &&
        amount <= 2000     &&
        balance >= 0       &&
        balance <= 2000    &&
        amount % 5 == 0    &&
        amount <= balance - .50)
    {
      balance = balance - amount - .50;
      System.out.printf("%.2f", balance);
    } else {
      System.out.printf("%.2f", balance);
    }

    sym.close();
  }
}
