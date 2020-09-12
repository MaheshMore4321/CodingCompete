package sd.sym.codingcompete.codechef.compete.march_challenge_2018_div_2.chef_and_glove;

import java.util.Scanner;

public class ChefandGlove {

  public static void main(String[] args) {

    Scanner src = new Scanner(System.in);

    int times = src.nextInt();
    for (int i = 0; i < times; i++) {

      int array = src.nextInt();
      int[] handArray = new int[array];
      int[] gloveArray = new int[array];
      for (int j = 0; j < handArray.length; j++) {
        handArray[j] = src.nextInt();
      }
      for (int j = 0; j < gloveArray.length; j++) {
        gloveArray[j] = src.nextInt();
      }
      manipulator(handArray,gloveArray);
    }
    src.close();
  }

  private static void manipulator(int[] handArray, int[] gloveArray) {
    boolean flag = checkForlength(handArray , gloveArray);
    boolean flagrev = checkForlength(handArray , reverseArray(gloveArray));


    if(flag && flagrev) {
      System.out.println("both");
    } else if(flag) {
      System.out.println("front");
    } else if(flagrev) {
      System.out.println("back");
    } else {
      System.out.println("none");
    }

  }

  private static boolean checkForlength(int[] handArray, int[] gloveArray) {
    for (int i = 0; i < gloveArray.length; i++) {
      if(handArray[i] > gloveArray[i]) {
        return false;
      }
    }

    return true;
  }

  public static  int[] reverseArray(int[] nums) {
    int[] reversed = new int[nums.length];
    for (int i=0; i<nums.length; i++) {
      reversed[i] = nums[nums.length - 1 - i];
    }
    return reversed;
  }
}
