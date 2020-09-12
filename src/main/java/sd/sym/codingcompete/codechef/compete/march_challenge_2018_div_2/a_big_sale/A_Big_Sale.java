package sd.sym.codingcompete.codechef.compete.march_challenge_2018_div_2.a_big_sale;

import java.util.Scanner;

public class A_Big_Sale {

  public static void main(String[] args) {

    Scanner src = new Scanner(System.in);

    int times = src.nextInt();
    for (int i = 0; i < times; i++) {
      int saleCount = src.nextInt();
      double[][] saleArray = new double[saleCount][3];

      for (int j = 0; j < saleArray.length; j++) {
        for (int j2 = 0; j2 < saleArray[j].length; j2++) {
          saleArray[j][j2] = src.nextDouble();
        }
      }

      manipulate(saleArray);
    }
    src.close();
  }

  private static void manipulate(double[][] saleArray) {

    double result = 0;

    for (double[] element : saleArray) {
      double rawAmt = element[0];
      double interstAmt = element[2];
      double noOfAmt = element[1];

      double discount = rawAmt * ( interstAmt / 100 ) ;
      double discountAdd = rawAmt + discount ;
      double discount2 = discountAdd * ( interstAmt / 100 ) ;
      double discountAdd2 = discountAdd - discount2 ;

      double points = rawAmt - discountAdd2 ;

      result += points * noOfAmt ;
    }

    System.out.println(String.format("%-12s", String.valueOf(result) ).replace(' ', '0'));
  }
}
