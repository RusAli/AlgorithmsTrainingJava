package homework.HW9;

import Helpers.BubbleSort;

public class SortArray {

  public static int[] sortArray(int[] arr){
    if(arr != null && arr.length > 0){
      BubbleSort.bubbleSort(arr);
      return arr;
    }

    return new int[]{};
  }
}
