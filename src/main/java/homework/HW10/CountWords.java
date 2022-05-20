package homework.HW10;

public class CountWords {

  public int countWords(String str, String word){

    if((str != null &&  word !=null) || (!word.isEmpty() && !str.isEmpty())){

      String sortedStr = str.replaceAll("\\pP","");
      String[] sortedArr = sortedStr.toLowerCase().split(" ");

      int countWord = 0;
      for(int i = 0; i < sortedArr.length; i++){
        if(sortedArr[i].equals(word.toLowerCase())){
          countWord++;
        }
      }

      return countWord;
    }

    return 0;
  }

  public static void main(String[] args) {
    String str =
            "As of March 2022, Java 18 is the latest version, " +
            "while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
            "Oracle released the last zero-cost public update for the legacy version Java 8 " +
            "LTS in January 2019 for commercial java use, " +
            "although it will otherwise still support Java 8 with public updates for personal " +
            "use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 " +
            "that are still receiving security and other upgrades.";

    String word = "Java";
    String word2 = "version";



    CountWords countWords = new CountWords();

    System.out.println(countWords.countWords(str,word));
    System.out.println(countWords.countWords(str,word2));




  }

}
