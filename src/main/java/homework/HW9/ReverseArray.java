package homework.HW9;

import java.util.Arrays;

public class ReverseArray {
  
  public static int[] reverseArray(int[] arr){

    if(arr != null && arr.length>0){

      int[] reversedArray = new int[arr.length];
      int c = 0;

      for(int i = arr.length -1; i >=0; i--){

        reversedArray[c] = arr[i];
        c++;

      }

      return reversedArray;

    }
    return new int[]{};
  }

  public static void main(String[] args) {
    int[] a = {2, 7, 3, 10};

    System.out.println(Arrays.toString(reverseArray(a)));
  }
}
