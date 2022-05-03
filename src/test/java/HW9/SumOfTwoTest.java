package HW9;

import homework.HW9.SumOfTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumOfTwoTest {

  @Test
  public void testSumOfTwo(){
    int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int sum = 12;
    int[][] expected = {{3, 9}, {7, 5}};

    SumOfTwo sumOfTwo = new SumOfTwo();
    int[][] actual = sumOfTwo.sumOfTwo(arr,sum);

    Assertions.assertTrue(Arrays.deepEquals(expected,actual));
  }
}
