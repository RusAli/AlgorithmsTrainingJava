package homework.HW10;

public class StringToNumbers {

  public int[] stringToNumber(String str){
    if(str != null & !str.isEmpty()){

      char[] unSortedString = str.toCharArray();
      int countNumber = 0;

      for (int i = 0; i < unSortedString.length; i++) {
        if(Character.isDigit(unSortedString[i])){
          countNumber++;
        }
      }

      int[] result = new int[countNumber];
      int index = 0;

      for (int i = 0; i < unSortedString.length; i++) {
        if(Character.isDigit(unSortedString[i])){
          result[index] = Character.getNumericValue(unSortedString[i]);
          index++;
        }
      }
      return result;
   }

    return new int[]{};
  }
}
