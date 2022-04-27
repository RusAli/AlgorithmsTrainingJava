package HW9;

import homework.HW9.SumArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

  @Test
  public void testPositiveSumArray(){
    int[] arr = {0, 1, 2, 3, 4, 5};
    int expected = 15;

    SumArray sumArray = new SumArray();
    int actual = sumArray.sumArray(arr);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testNegativeSumArray(){
    int[] arr = {-7, -3};
    int expected = -10;

    SumArray sumArray = new SumArray();
    int actual = sumArray.sumArray(arr);

    Assertions.assertEquals(expected,actual);

  }
}
