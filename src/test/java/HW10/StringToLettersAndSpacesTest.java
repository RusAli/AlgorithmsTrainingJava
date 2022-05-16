package HW10;

import homework.HW10.StringToLettersAndSpaces;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

  @Test
  public void testStringToLettersAndSpacesTest(){
    String str = "q@34 w?><e%r(*t0 013y";
    String expected = "q wert y";

    StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
    String actual = stringToLettersAndSpaces.stringToLettersAndSpaces(str);

    Assertions.assertEquals(expected,actual);
  }

}
