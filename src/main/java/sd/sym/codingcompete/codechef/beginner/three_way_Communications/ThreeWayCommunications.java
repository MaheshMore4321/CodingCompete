package sd.sym.codingcompete.codechef.beginner.three_way_Communications;

import java.util.Scanner;

class ThreeWayCommunications {
  public static void main(String[] Sym) {
    Scanner sym = new Scanner(System.in);
    int noOfTimes = sym.nextInt();
    for (int i = 0; i < noOfTimes; i++) {
      int Gdist = sym.nextInt();
      int[][] Intarr = new int[3][2];
      for (int j = 0; j < 3; j++) {
        Intarr[j][0] = sym.nextInt();
        Intarr[j][1] = sym.nextInt();
      }
      double pt1 =  Math.sqrt(Math.pow(Intarr[0][0]-Intarr[1][0] ,2) + Math.pow(Intarr[0][1]-Intarr[1][1] ,2));
      double pt2 =  Math.sqrt(Math.pow(Intarr[1][0]-Intarr[2][0] ,2) + Math.pow(Intarr[1][1]-Intarr[2][1] ,2));
      double pt3 =  Math.sqrt(Math.pow(Intarr[2][0]-Intarr[0][0] ,2) + Math.pow(Intarr[2][1]-Intarr[0][1] ,2));

      int f=0;
      if(pt1>Gdist && pt2<=Gdist && pt3<=Gdist){f+=1;}
      else if(pt1<=Gdist) {
        f+=1;
      }
      if(pt2>Gdist&&pt1<=Gdist&&pt3<=Gdist){f+=1;}
      else if(pt2<=Gdist) {
        f+=1;
      }
      if(pt3>Gdist&&pt2<=Gdist&&pt1<=Gdist){f+=1;}
      else if(pt3<=Gdist) {
        f+=1;
      }

      if(f==3) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
    sym.close();
  }
}
