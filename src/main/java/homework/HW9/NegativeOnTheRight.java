package homework.HW9;

public class NegativeOnTheRight {

  public int[] negativeOnTheRight(int[] array){
    if(array != null && array.length > 0){
      
      int countPositiveForArray = 0;
      int countNegativeForArray = 0;

      for (int item : array) {
        if(item > 0){
          countPositiveForArray++;
        }else{
          countNegativeForArray++;
        }
      }

      int[] PositiveArray = new int[countPositiveForArray];
      int[] NegativeArray = new int[countNegativeForArray];

      int indexPositive = 0;
      int indexNegative = 0;

      for(int item : array){
        if( item > 0){
          PositiveArray[indexPositive] = item;
          indexPositive++;
        }else{
          NegativeArray[indexNegative] = item;
          indexNegative++;
        }
      }

      int unionIndex = 0;
      int[] result = new int[array.length];
      for (int i = 0; i < PositiveArray.length; i++) {
        result[unionIndex] = PositiveArray[i];
        unionIndex++;
      }

      for (int i = 0; i < NegativeArray.length; i++) {
        result[unionIndex++] = NegativeArray[i];

      }

      return result;
    }

    return new int[]{};
  }
}
