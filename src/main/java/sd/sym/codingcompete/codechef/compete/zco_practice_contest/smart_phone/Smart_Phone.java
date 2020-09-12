package sd.sym.codingcompete.codechef.compete.zco_practice_contest.smart_phone;

import java.util.Arrays;
import java.util.Scanner;

public class Smart_Phone {

  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    long n_values = sym.nextLong();

    long nValuesArrray[] = new long[(int) n_values];

    for (int i = 0; i < nValuesArrray.length; i++) {
      nValuesArrray[i] = sym.nextLong();
    }

    Arrays.sort(nValuesArrray);
    long maximum_Size = -1;

    for (int i = 0; i < nValuesArrray.length; i++) {
      maximum_Size = max(maximum_Size, nValuesArrray[i] * (n_values - i));
    }

    System.out.println(maximum_Size);

    sym.close();

  }


  private static long max(long msf, long l) {

    if( msf > l ) {
      return msf;
    } else {
      return l ;
    }
  }

}
