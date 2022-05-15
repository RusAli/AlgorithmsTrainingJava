package HW10;

import homework.HW10.StringToNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

  @Test
  public void testStringToNumbers(){
    String str = "1, 2, 3, 4, 5";
    int[] expected = {1, 2, 3, 4, 5};

    StringToNumbers stringToNumbers = new StringToNumbers();
    int[] actual =  stringToNumbers.stringToNumber(str);

    Assertions.assertArrayEquals(expected,actual);
  }

  @Test
  public void testStringToNumbersWithLetters(){
    String str = "1, 2, 3, 4, 5, a, 4, 6";
    int[] expected = {1, 2, 3, 4, 5, 4, 6};

    StringToNumbers stringToNumbers = new StringToNumbers();
    int[] actual =  stringToNumbers.stringToNumber(str);

    Assertions.assertArrayEquals(expected,actual);
  }

  @Test
  public void testStringToNumbersWithSymbols(){
    String str = "1, 2, 3, 4, 5, !, ?, %";
    int[] expected = {1, 2, 3, 4, 5};

    StringToNumbers stringToNumbers = new StringToNumbers();
    int[] actual =  stringToNumbers.stringToNumber(str);

    Assertions.assertArrayEquals(expected,actual);
  }


}
