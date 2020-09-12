package sd.sym.codingcompete.codechef.beginner.chef_and_operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChefAndOperators {
  public static void main(String[] args)  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int t = Integer.parseInt(br.readLine());
      for(int i = 0; i < t; i++){
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a==b) {
          System.out.println("=");
        } else if(a>b) {
          System.out.println(">");
        } else if(a<b) {
          System.out.println("<");
        }
      }
    }catch (Exception e) {
    }
  }
}

/*
 * public class ChefAndOperators {
	public static void main(String[] args) {
		 Scanner sym = new Scanner(System.in);
         int t = sym.nextInt();
         for(int i = 0; i < t; i++){
        	 int a = sym.nextInt();
        	 int b = sym.nextInt();
             if(a==b) System.out.println("=");
             else if(a>b) System.out.println(">");
             else if(a<b) System.out.println("<");
          }
         sym.close();
	}
}
 */
