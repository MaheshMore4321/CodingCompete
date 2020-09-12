package sd.sym.codingcompete.codechef.beginner.the_lead_game;

import java.util.Scanner;

class TheLeadGame
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int round = sym.nextInt();
    int[] intarrr = new int[]{0,0};
    int a = 0 , b = 0;

    for (int i = 0; i < round; i++)
    {
      a += sym.nextInt();
      b += sym.nextInt();

      int absVal = Math.abs(a-b);
      if(intarrr[1] < absVal)
      {
        intarrr[0] = a > b ? 1 : 2 ;
        intarrr[1] = absVal ;
      }
    }
    System.out.println(intarrr[0]+" "+intarrr[1]);
    sym.close();
  }
}



/*package sd.sym.codingcompete.codechef.beginner.TheLeadGame;

import java.util.Scanner;

public class TheLeadGame {

	public static void main(String[] sym) {
		new TheLeadGame().read();
	}

	public void read() {
		Scanner sym = new Scanner(System.in);
		int round = sym.nextInt();
		int[][] intarr = new int[round][2];

		for (int i = 0; i < round; i++) {
			for (int i1 = 0; i1 < 2; i1++) {
				intarr[i][i1] = sym.nextInt();
			}
		}
		ops(intarr);
		sym.close();
	}

	public void ops(int[][] intarr) {
		int[][] newintarr = new int[intarr.length][intarr[0].length];

		for (int i = 0; i < intarr.length; i++) {
			if(intarr[i][0] > intarr[i][1]) {
				newintarr[i][0] = 1;
			}
			else {
				newintarr[i][0] = 2;
			}
			newintarr[i][1] = Math.abs(intarr[i][0] - intarr[i][1]);
		}
		chekmaxx(newintarr);
		System.out.println("Done");
	}

	public void chekmaxx(int[][] intarr) {
		int[] returnmax = intarr[0];

		for (int i = 1; i < intarr.length; i++) {
			if(returnmax[1] < intarr[i][1]) {
				returnmax = new int[]{intarr[i][0],intarr[i][1]} ;
			}
		}
		for(int a : returnmax) {
			System.out.print(a+" ");
		}
	}
}
 */

