package homework.HW9;

import Helpers.BubbleSort;

public class MinMaxAve {

  public int[] minMaxAve(int[] array, int startIndex, int endIndex) {

    if (array != null && array.length > 0) {
      if (endIndex >= startIndex && startIndex >=0 && endIndex <= array.length-1) {
        int range = endIndex - startIndex + 1;
        int[] array2 = new int[range];
        int count = 0;

        for (int i = startIndex; i <= endIndex; i++) {
          array2[count] = array[i];
          count++;
        }

        BubbleSort.bubbleSort(array2);

        int Min = array2[0];
        int Max = array2[array2.length - 1];
        int sum = 0;

        for (int i = 0; i < array2.length; i++) {
          sum += array2[i];
        }

        int Ave = sum / array2.length;

        int[] result = {Min, Max, Ave};
        return result;

      }

      return new int[]{};
    }
    return new int[]{};
  }
}









