package HW9;

import homework.HW9.MinMaxAve;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

  @Test
  public void testMinMaxAve(){

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int startIndex = 2;
    int endIndex = 6;
    int[] expected = {3, 7, 5};

    int[] actual = MinMaxAve.minMaxAve(array,startIndex,endIndex);

    Assertions.assertArrayEquals(expected,actual);
  }

  @Test
  public void testMinMaxAveWithEmptyArr(){

    int[] array = {};
    int startIndex = 2;
    int endIndex = 6;
    int[] expected = {};

    int[] actual = MinMaxAve.minMaxAve(array,startIndex,endIndex);

    Assertions.assertArrayEquals(expected,actual);
  }

  @Test
  public void testMinMaxAveWithInvalidEndIndex(){

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int startIndex = 3;
    int endIndex = 1;
    int[] expected = {};

    int[] actual = MinMaxAve.minMaxAve(array,startIndex,endIndex);

    Assertions.assertArrayEquals(expected,actual);
  }




}
