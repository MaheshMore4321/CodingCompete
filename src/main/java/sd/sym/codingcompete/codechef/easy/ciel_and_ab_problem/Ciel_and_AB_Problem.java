package sd.sym.codingcompete.codechef.easy.ciel_and_ab_problem;

import java.util.Scanner;

class Ciel_and_AB_Problem
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);

    int Subint = sym.nextInt() - sym.nextInt();
    String Sub = String.valueOf(Subint);

    char chatAtZero = Sub.charAt(0);

    if(chatAtZero != '9') {
      Subint = Subint + (int)Math.pow(10, Sub.length()-1);
    }else{
      Subint = Subint - (int)Math.pow(10, Sub.length()-1);
    }

    System.out.println(Subint);
    sym.close();
  }
}

/*
import java.util.Scanner;

class Ciel_and_AB_Problem
{
	public static void main(String[] Sym)
	{
		Scanner sym = new Scanner(System.in);

		int Subint = ( sym.nextInt() - sym.nextInt());
		String Sub = String.valueOf(Subint);

		char chatAtZero = Sub.charAt(0);

		if(chatAtZero != '9') {
			System.out.println( (int)(Subint + Math.pow(10, Sub.length()-1)) );
		}else{
			System.out.println( (int)(Subint - Math.pow(10, Sub.length()-1)) );
		}

		sym.close();
	}
}
 */