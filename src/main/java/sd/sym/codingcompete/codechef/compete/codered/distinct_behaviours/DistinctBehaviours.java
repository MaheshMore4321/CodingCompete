package sd.sym.codingcompete.codechef.compete.codered.distinct_behaviours;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctBehaviours {

  public static void main(String[] Sym) {

    Scanner sym = new Scanner(System.in);
    int testCases = sym.nextInt();
    Set<String> lnkdSet = new LinkedHashSet<String>();
    for (int i = 0; i < testCases; i++) {
      lnkdSet.add(sym.next());
    }
    System.out.println(lnkdSet.size());
    sym.close();
  }
}
