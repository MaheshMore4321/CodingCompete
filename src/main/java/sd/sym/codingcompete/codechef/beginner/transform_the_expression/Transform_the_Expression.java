package sd.sym.codingcompete.codechef.beginner.transform_the_expression;

import java.util.Scanner;

class Transform_the_Expression {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int times = sym.nextInt();
    for (int i = 0; i < times; i++) {
      String str = sym.next();String strng = "";String spcl = "";

      for (int j = 0; j < str.length(); j++){
        if(str.charAt(j) == '('){}
        else if(str.charAt(j) == ')'){
          strng = strng + String.valueOf(spcl.charAt(spcl.length()-1));
          spcl = spcl.substring(0, spcl.length()-1);}
        else {
          char ch = str.charAt(j);
          if(ch>='a' && ch<='z'){
            strng = strng + String.valueOf(ch);
          }
          else {
            spcl = spcl + String.valueOf(ch);
          }
        }
      }

      if(spcl.length()>0){
        strng = strng + String.valueOf(spcl.charAt(spcl.length()-1));
        spcl = spcl.substring(0, spcl.length()-1);
      }
      System.out.println(strng);
    }
    sym.close();
  }
}