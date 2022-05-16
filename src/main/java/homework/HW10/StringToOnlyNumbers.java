package homework.HW10;

public class StringToOnlyNumbers {

  public String stringToOnlyNumbers(String str){

    if(str != null && !str.isEmpty()){
      char[] unsortedArr = str.toCharArray();

      int countLetters = 0;
      for (int i = 0; i < unsortedArr.length; i++) {
        if(Character.isDigit(unsortedArr[i])){
          countLetters++;
        }
      }

      String[] sortedArr = new String[countLetters];

      int index = 0;
      for (int i = 0; i < unsortedArr.length; i++) {
        if(Character.isDigit(unsortedArr[i])){
          sortedArr[index] = unsortedArr[i]+"";
          index++;
        }
      }

      String result = String.join("",sortedArr);

      return result;
    }

    return "empty";

  }
}
