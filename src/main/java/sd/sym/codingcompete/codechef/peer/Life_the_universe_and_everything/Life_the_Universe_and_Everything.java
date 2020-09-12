package sd.sym.codingcompete.codechef.peer.Life_the_universe_and_everything;

import java.io.BufferedReader;
import java.io.IOException;

public class Life_the_Universe_and_Everything
{
  public static void main(String[] Sym) throws IOException
  {
    BufferedReader r = new BufferedReader(new java.io.InputStreamReader (System.in));
    String str;		while( ( str = r.readLine() ) != "null" )
    {
      int integer = Integer.parseInt(str);
      if ( integer == 42 ) {
        break;
      }
      System.out.println(integer);
    }
  }
}