package HW10;

import homework.HW10.StringToLetters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

  @Test
  public void testStringToLetters(){
    String str = "q@34w?><e%r(*t0013y";
    String expected = "qwerty";

    StringToLetters stringToLetters = new StringToLetters();
    String actual = stringToLetters.stringToLetter(str);

    Assertions.assertEquals(expected,actual);
  }
}
