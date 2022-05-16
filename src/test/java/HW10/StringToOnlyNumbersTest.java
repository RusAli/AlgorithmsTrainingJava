package HW10;

import homework.HW10.StringToOnlyNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToOnlyNumbersTest {

  @Test
  public void testStringToOnlyNumbers(){
    String str = "1q2e345d";
    String expected = "12345";

    StringToOnlyNumbers stringToOnlyNumbers = new StringToOnlyNumbers();
    String actual = stringToOnlyNumbers.stringToOnlyNumbers(str);

    Assertions.assertEquals(expected,actual);
  }

}
