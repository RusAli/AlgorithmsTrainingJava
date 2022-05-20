package homework.HW10;

public class StartsWithLetter {

  public String startsWithLetter(String str, char letter){

    if((str != null && letter != '\u0000') || (letter != 0 && !str.isEmpty())){

      String sortedStr = str.replaceAll("\\pP","").replace("\n"," ");
      String[] sortedArr = sortedStr.split(" ");
      String result = "";

      for(int i = 0 ; i < sortedArr.length; i++){
        if(sortedArr[i].toLowerCase().charAt(0) == letter || sortedArr[i].toUpperCase().charAt(0) == letter){
          result += sortedArr[i] + " ";
        }
      }

      return result.trim().replace(" ",", ");
     }

    return "invalid parameters";

  }
}

