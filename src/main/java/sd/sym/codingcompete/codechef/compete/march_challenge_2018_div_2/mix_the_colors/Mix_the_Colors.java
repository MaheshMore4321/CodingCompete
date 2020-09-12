package sd.sym.codingcompete.codechef.compete.march_challenge_2018_div_2.mix_the_colors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mix_the_Colors {

  public static int index;

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

    int times = Integer.parseInt(br.readLine());
    for (int i = 0; i < times; i++) {
      String[] intArr = new String[Integer.parseInt(br.readLine())];

      intArr = br.readLine().split(" ");

      Manipulate(intArr);
    }

  }

  private static void Manipulate(String[] arlst) {

    int count = 0 ;

    while(true) {

      if(distinct(arlst)) {
        break;
      }

      int i = index;

      int val = Integer.parseInt(arlst[i + 1]) + Integer.parseInt(arlst[i]) ;

      count += checkForContain( arlst , val+"" );
      arlst[i] = val+"" ;

    }
    System.out.println(count);
  }

  private static int checkForContain(String[] array, String key) {
    for (String n : array) {
      if (key.equals(n) ) {
        return 0;
      }
    }
    return 1;
  }

  private static boolean distinct(String[] arlst) {

    for (int i = 0; i < arlst.length; i++) {
      for (int i1 = i + 1 ; i1 < arlst.length; i1++) {
        if(arlst[i].equals(arlst[i1])) {
          index = i ;
          return false;
        }
      }
    }

    return true;
  }
}
