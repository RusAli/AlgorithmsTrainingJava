package homework.HW9;

import java.util.Arrays;

public class NumberOccurrences {

  public int[][] numberOccurrences(int[] arr){
    if(arr != null && arr.length>0){

      Arrays.sort(arr);
      int number = 0;
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] == arr[i]) {
            break;
          } else {
            number++;
            break;
          }
        }
      }

      int[][] result = new int[number + 1][2];

      number = 0;
      int count = 0;

      for (int i = 0; i < arr.length; i += count) {
        result[number][0] = arr[i];
        count = 0;
        for (int j = 0; j < arr.length; j++) {
          if (arr[j] == arr[i]) {
            count++;
          }
        }
        result[number][1] = count;
        number++;
      }

      return result;
    }

    return new int[][]{};
  }
 }

