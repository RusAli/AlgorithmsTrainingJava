package homework.HW9;

public class KthLargest {

  public int kthLargest(int[] arr, int index){
    int a = 0;

    if(arr != null & arr.length >0 && index >0 && index <= arr.length){
      int k = arr.length - index;
      SortArray.sortArray(arr);
      return arr[k];

    }

    return a;
  }
}
