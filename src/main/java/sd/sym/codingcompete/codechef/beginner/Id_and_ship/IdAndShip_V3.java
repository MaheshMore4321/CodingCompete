package sd.sym.codingcompete.codechef.beginner.Id_and_ship;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class IdAndShip_V3{

  public static void main(String[] args) throws IOException {

    Scanner lea = new Scanner();
    try (PrintWriter so = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)))) {

      int t = lea.nextInt();
      for(int i = 0; i < t; i++){
        String c = lea.next();

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
  }

  static class Scanner{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    StringTokenizer st = new StringTokenizer("");

    public String next() throws IOException{
      while(!st.hasMoreTokens()){
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }

    public int nextInt() throws IOException{
      return Integer.parseInt(next());
    }
  }

}