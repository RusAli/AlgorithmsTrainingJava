package HW10;

import homework.HW10.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

  @Test
  public void testReverseString(){
    String str= "Abracadabra";
    String expected = "arbadacarbA";

    ReverseString reverseString = new ReverseString();
    String actual = reverseString.reverseString(str);

    Assertions.assertEquals(expected,actual);

  }
}
