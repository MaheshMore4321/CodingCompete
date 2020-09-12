package sd.sym.codingcompete.codechef.medium.bytelandian_gold_coins;

import java.util.HashMap;
import java.util.Scanner;

public class Bytelandian_gold_coins
{
  public static HashMap< Long , Long > hashmap = new HashMap< Long , Long >();

  public static void main(String[] Sym)
  {
    Scanner sym = new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
      System.out.println(findMax(sym.nextLong()));
    }
    sym.close();
  }


  public static long findMax(Long val)
  {
    if( val < 12)
    {
      return val;
    }
    else
    {
      if(hashmap.containsKey(val))
      {
        return hashmap.get(val);
      }
      else
      {
        long result = Math.max( val , findMax(val/2) + findMax(val/3) + findMax(val/4));
        hashmap.put( val , result );
        return result;
      }
    }
  }
}




























/*{
	public static HashMap<Long, Long> hshmp = new HashMap<Long, Long>();

	public static void main(String[] Sym)
	{
		Scanner sym = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			new Bytelandian_gold_coins().findMax(sym.nextLong());
		}
		sym.close();
	}

	public long findMax (Long val)
	{
		if(val < 12 )
		{
			return val;
		}else
		{
			if(hshmp.containsKey(val))
			{
				return hshmp.get(val);
			}
			else
			{
				long result = Math.max(val , findMax(val/2) + findMax(val/3) + findMax(val/4));
				hshmp.put(val, result);
				return result;
			}
		}
	}
}*/

