package homework.HW9;

public class SumOfTwo {

  public int[][] sumOfTwo(int[] arr, int sum){
    if(arr != null && arr.length > 0){

      int  countPair = 0;

      for (int i = 0; i < arr.length; i++) {
        for (int j = i +1; j < arr.length; j++) {
          if(arr[i] + arr[j] == sum){
            countPair++;
          }
        }
      }

      int[][] result = new int[countPair][2];
      int indexResult = 0;

      for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
          if(arr[i] + arr[j] == sum){
            result[indexResult][0] = arr[i];
            result[indexResult][1] = arr[j];
              if(indexResult < countPair-1){
              indexResult++;
              }

          }

        }
      }

      return result;
    }

    return new int[][]{};
  }
}

