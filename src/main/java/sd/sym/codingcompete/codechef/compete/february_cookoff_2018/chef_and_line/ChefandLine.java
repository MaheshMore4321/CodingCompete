package sd.sym.codingcompete.codechef.compete.february_cookoff_2018.chef_and_line;

import java.util.Arrays;
import java.util.Scanner;

public class ChefandLine {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int testCases[] = new int[t];

    for(int i=0;i<t;i++){
      int n = s.nextInt();
      long k = s.nextLong();
      long b = s.nextLong();
      long arr[] = new long[n];
      for(int j=0;j<n;j++) {
        arr[j] = s.nextLong();
      }
      Arrays.sort(arr);
      long check = arr[arr.length-1];
      int count = 1;
      for(int j=arr.length-2;j>=0;j--){
        //					System.out.println("Num : "+check);
        if(arr[j]*k+b<=check){
          count++;
          check = arr[j];
        }
      }
      testCases[i] = count;
    }

    for(int i=0;i<t;i++){
      System.out.println(testCases[i]);
    }
    s.close();
  }
}