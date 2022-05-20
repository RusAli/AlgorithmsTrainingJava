package homework.HW10;

public class RemoveDuplicates {

  public String removeDuplicates (String str){

    if(!str.isEmpty() && str != null){

      String result = "";
      String[] arr = str.toLowerCase().split("");

      for (int i = 0; i < arr.length ; i++) {
        if(!result.contains(arr[i])){
          result += arr[i];
        }
      }

      return result;
    }

    return "invalid string";
  }

}
