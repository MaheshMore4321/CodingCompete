package sd.sym.codingcompete.codechef.hard.ordering_the_soldiers;

import java.util.LinkedList;
import java.util.Scanner;

public class Ordering_the_Soldiers
{
  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    int times = sym.nextInt();
    for (int i = 0; i < times; i++)
    {
      int n = sym.nextInt();
      String str = "";
      for (int j = 0; j < n; j++)
      {
        str += sym.next() + " ";
      }

      String[] strArr = str.split(" ");

      for (int j = 0; j < strArr.length - 1; j++)
      {
        for (int j1 = j  ; j1 < strArr.length; j1++)
        {
          if(strArr[j].equals(strArr[j1]) && j1 != j )
          {
            strArr[j1] = "0";
          }
        }
      }

      LinkedList<Integer> lnkdlst = new LinkedList<Integer>();
      for (int j = 1; j <= n; j++)
      {
        if(!str.contains(j+""))
        {
          lnkdlst.add(j);
        }
      }

      for (int j = 0; j < strArr.length; j++)
      {
        if(strArr[j].equals("0"))
        {
          if(strArr.length/2 > j)
          {
            System.out.print(lnkdlst.get(0)+" ");
            lnkdlst.remove(0);
          }
          else
          {
            int index = lnkdlst.size() - 1 ;
            System.out.print(lnkdlst.get(index)+" ");
            lnkdlst.remove(index);
          }
        }
        else
        {
          System.out.print(strArr[j]+" ");
        }
      }
    }
    sym.close();
  }
}
