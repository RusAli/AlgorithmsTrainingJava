package HW9;

import homework.HW9.NumberOccurrences;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOccurrencesTest {

  @Test
  public void testNumberOccurrences(){
    int[] arr = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
    int[][] expected = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

    NumberOccurrences numberOccurrences = new NumberOccurrences();
    int[][] actual = numberOccurrences.numberOccurrences(arr);

    Assertions.assertTrue(Arrays.deepEquals(expected,actual));
  }

  @Test
  public void testNumberOccurrencesWithEmptyArr(){
    int[] arr = {};
    int[][] expected = {};

    NumberOccurrences numberOccurrences = new NumberOccurrences();
    int[][] actual = numberOccurrences.numberOccurrences(arr);

    Assertions.assertTrue(Arrays.deepEquals(expected,actual));
  }



}
