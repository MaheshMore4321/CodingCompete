package sd.sym.codingcompete.codechef.beginner.enormousInput_test;

import java.util.Scanner;

public class EnormousInputTest {

  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int a = sym.nextInt();
    int b = sym.nextInt();

    int count = 0 ;
    for( int i = 0 ; i < a ; i++ )
    {
      if( sym.nextInt() % b == 0 )
      {
        count++;
      }
    }
    System.out.println(count);
    sym.close();
  }
}
