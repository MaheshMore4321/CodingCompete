package sd.sym.codingcompete.codechef.beginner.Id_and_ship;

import java.util.Scanner;

public class IdAndShip {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int n = sym.nextInt();
    for (int i = 0; i < n; i++) {
      String in = sym.next();
      if(null!=in) {
        System.out.println(print(in));
      }
    }
    sym.close();
  }

  public static String print(String input)
  {
    if(input.equalsIgnoreCase("b"))
    {
      return "BattleShip";
    }
    else if(input.equalsIgnoreCase("c"))
    {
      return "Cruiser";
    }
    else if(input.equalsIgnoreCase("d"))
    {
      return "Destroyer";
    }
    else if(input.equalsIgnoreCase("f"))
    {
      return "Frigate";
    }
    return null;
  }
}
