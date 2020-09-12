package sd.sym.codingcompete.codechef.compete.january_lunchtime2018.chef_and_game_with_sequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndGameWithSequence {

  public static void main(String[] Sym) {

    Scanner sym = new Scanner(System.in);
    int testCase = sym.nextInt();

    for (int i = 0; i < testCase; i++) {

      int noofVariables = sym.nextInt();
      List<Integer> intlist = new ArrayList<Integer>();

      for (int j = 0; j < noofVariables ; j++) {
        intlist.add(sym.nextInt());
      }

      System.out.println(Ops(intlist).size());


    }

    sym.close();
  }

  private static List<Integer> Ops(List<Integer> intlist) {

    for (int i = 0; i < intlist.size(); i++)
    {
      for (int j = 0; j < intlist.size(); j++) {

        if( i != j )
        {
          if((intlist.get(i) + intlist.get(j)) % 2 == 0)
          {
            int x  = intlist.get(i)+ intlist.get(j);
            intlist.remove(i);
            intlist.add(i, x);
            intlist.remove(j);
            i = 0 ;
          }
        }

      }
    }

    return intlist;
  }
}
