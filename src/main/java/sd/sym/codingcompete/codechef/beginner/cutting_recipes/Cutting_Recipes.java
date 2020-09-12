package sd.sym.codingcompete.codechef.beginner.cutting_recipes;

import java.util.Arrays;
import java.util.Collections;
import java .util.Scanner;

class Cutting_Recipes {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int noOfTestCase = sym.nextInt();
    for (int i = 0; i < noOfTestCase; i++) {
      int noOfIndigrades = sym.nextInt();
      Integer[] indigradesArray = new Integer[noOfIndigrades];
      for (int j = 0; j < noOfIndigrades; j++) {
        indigradesArray[j] = sym.nextInt();
      }

      int min = Collections.min(Arrays.asList(indigradesArray));
      for (int j = min ; j > 1 ; j--) {
        indigradesArray = new Cutting_Recipes().reduceArray(indigradesArray , j);
      }

      for (Integer element : indigradesArray) {
        System.out.print(element+" ");
      }
      System.out.println();
    }
    sym.close();
  }

  public Integer[] reduceArray(Integer[] indigradesArray , int min) {
    boolean flag = true ;
    for (Integer element : indigradesArray) {
      if( element%min != 0 ) {
        flag = false;
      }
    }
    if(flag) {
      for (int j = 0; j < indigradesArray.length; j++) {
        indigradesArray[j]=indigradesArray[j]/min;
      }
    }
    return indigradesArray;
  }
}
