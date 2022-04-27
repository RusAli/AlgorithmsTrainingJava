package homework.HW9;

public class OddIndices {

  public int[] oddIndices(int[] arr){

    if(arr != null && arr.length >0) {


      int count = 0;

      for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 1) {
          count++;
        }
      }

      int[] result = new int[count];
      int index = 0;

      for (int j = 0; j < arr.length; j++) {
        if (j % 2 == 1) {
          result[index] = arr[j];
          index++;
        }
      }

      return result;
    }else

      return new int[]{};

    }
  }



