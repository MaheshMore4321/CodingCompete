package sd.sym.codingcompete.codechef.beginner.Id_and_ship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdAndShip_v4{

  public static void main(String[] Sym) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for(int i = 0; i < t; i++){
      String c = br.readLine();
      if(c.equalsIgnoreCase("B")) {
        System.out.println("BattleShip");
      } else if(c.equalsIgnoreCase("C")) {
        System.out.println("Cruiser");
      } else if(c.equalsIgnoreCase("D")) {
        System.out.println("Destroyer");
      } else if(c.equalsIgnoreCase("F")) {
        System.out.println("Frigate");
      }
    }
  }
}