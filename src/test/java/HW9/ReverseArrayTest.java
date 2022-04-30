package HW9;

import homework.HW9.ReverseArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

  @Test
  public void testReverseArray(){
    int[] arr = {2, 7, 3, 10};
    int[] expected = {10, 3, 7, 2};

    int[] actual = ReverseArray.reverseArray(arr);

    Assertions.assertArrayEquals(expected,actual);

  }

  @Test
  public void testReverseEmptyArray(){
    int[] arr = {};
    int[] expected = {};

    int[] actual = ReverseArray.reverseArray(arr);

    Assertions.assertArrayEquals(expected,actual);

  }
}
