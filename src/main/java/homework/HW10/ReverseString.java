package homework.HW10;

public class ReverseString {

  public String reverseString(String str){

    if(!str.isEmpty() && str != null){

      String result = "";
      char[] arr = str.toCharArray();

      for (int i = arr.length-1; i >= 0; i--) {
        result = result + arr[i];
      }

      return result;
    }

    return "invalid string";
  }
}
