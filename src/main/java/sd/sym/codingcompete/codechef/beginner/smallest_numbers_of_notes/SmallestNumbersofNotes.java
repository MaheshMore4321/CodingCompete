package sd.sym.codingcompete.codechef.beginner.smallest_numbers_of_notes;

import java.util.Scanner;

class SmallestNumbersofNotes {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      System.out.println(new SmallestNumbersofNotes().ChnaheInCurrency(sym.nextInt()));
    }
    sym.close();
  }

  private int ChnaheInCurrency(int nextInt) {
    int currency = 0;
    int[] intarr = {100,50,10,5,2,1};
    for (int element : intarr) {
      if(nextInt >= element) {
        int v = nextInt / element ;
        nextInt = nextInt - v*element;
        currency += v;
      }
    }
    return currency;
  }
}
