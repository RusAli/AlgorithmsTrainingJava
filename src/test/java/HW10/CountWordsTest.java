package HW10;

import homework.HW10.CountWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWordsTest {

  @Test
  public void testCountWords1(){
    String str =
            "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
            "long-term support (LTS) versions. Oracle released the last zero-cost public update" +
            " for the legacy version Java 8 LTS in January 2019 for commercial java use, although" +
            " it will otherwise still support Java 8 with public updates for personal use indefinitely." +
            " Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving" +
            " security and other upgrades.";

    String word = "Java";
    int expected = 5;

    CountWords countWords = new CountWords();
    int actual = countWords.countWords(str,word);

    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testCountWords2(){
    String str =
            "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
            "long-term support (LTS) versions. Oracle released the last zero-cost public update" +
            " for the legacy version Java 8 LTS in January 2019 for commercial java use, although" +
            " it will otherwise still support Java 8 with public updates for personal use indefinitely." +
            " Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving" +
            " security and other upgrades.";

    String word = "version";
    int expected = 2;

    CountWords countWords = new CountWords();
    int actual = countWords.countWords(str,word);

    Assertions.assertEquals(expected,actual);
  }
}
