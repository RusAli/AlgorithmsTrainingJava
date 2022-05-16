package HW10;

import homework.HW10.StringToNumbersAndSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {

  @Test
  public void testStringToNumbersAndSpaces(){
    String str = "1 23 der@ 4$5";
    String expected = "1 23  45";

    StringToNumbersAndSpaces stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
    String actual =stringToNumbersAndSpaces.stringToNumbersAndSpaces(str);

    Assertions.assertEquals(expected,actual);
  }
}
