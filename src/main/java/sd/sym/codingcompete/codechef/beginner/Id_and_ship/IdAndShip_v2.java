package sd.sym.codingcompete.codechef.beginner.Id_and_ship;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdAndShip_v2{

  public static void main(String[] Sym) throws IOException {
    Scanner sym = new Scanner(System.in);
    try (PrintWriter so = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)))) {

      int t = sym.nextInt();
      for(int i = 0; i < t; i++){
        String c = sym.next();

        if(c.equalsIgnoreCase("B")) {
          so.println("BattleShip");
        } else if(c.equalsIgnoreCase("C")) {
          so.println("Cruiser");
        } else if(c.equalsIgnoreCase("D")) {
          so.println("Destroyer");
        } else if(c.equalsIgnoreCase("F")) {
          so.println("Frigate");
        }
      }
    }
    sym.close();
  }
}