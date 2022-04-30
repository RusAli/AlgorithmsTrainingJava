package homework.HW9;

public class Intersection {

  public static int[] intersection(int[] arr1, int[] arr2){

    if(arr1 != null && arr2 != null && arr1.length > 0 && arr2.length > 0){

      int c = 0;

      for(int i = 0; i < arr1.length;i++){
        for (int j = 0; j < arr2.length; j++) {
          if(arr1[i] == arr2[j]){
            c++;
          }
        }
      }

      int[] result = new int[c];

      if(c == 0){
        return new int[]{};
      }else{
        int index = 0;

        for(int i = 0; i < arr1.length;i++){
          for (int j = 0; j < arr2.length; j++) {
            if(arr1[i] == arr2[j]){
              result[index] = arr1[i];
              index++;
            }
          }
        }

        return result;
      }
    }

    return new int[]{};
  }
}
