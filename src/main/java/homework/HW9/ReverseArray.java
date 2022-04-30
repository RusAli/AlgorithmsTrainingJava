package homework.HW9;

public class ReverseArray {
  
  public int[] reverseArray(int[] arr){

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
}
