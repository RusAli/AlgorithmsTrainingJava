package HW9;

import homework.HW9.NegativeOnTheRight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

  @Test
  public void testNegativeOnTheRight(){
    int[] test = {4, -3, 7, -12, 5, -2, 9, 4, 12};
    int[] expected = {4, 7, 5, 9, 4, 12, -3, -12, -2};

    NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
    int[] actual = negativeOnTheRight.negativeOnTheRight(test);

    Assertions.assertArrayEquals(expected,actual);

  }

  @Test
  public void testNegativeOnTheRightOnlyPotiveArray(){
    int[] test = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int[] expected = {4, 3, 7, 12, 5, 2, 9, 4, 12};

    NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
    int[] actual = negativeOnTheRight.negativeOnTheRight(test);

    Assertions.assertArrayEquals(expected,actual);

  }

  @Test
  public void testNegativeOnTheRightOnlyNegativeArray(){
    int[] test = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
    int[] expected = {-4, -3, -7, -12, -5, -2, -9, -4, -12};

    NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
    int[] actual = negativeOnTheRight.negativeOnTheRight(test);

    Assertions.assertArrayEquals(expected,actual);

  }


  @Test
  public void testNegativeOnTheRightEmptyArray(){
    int[] test = {};
    int[] expected = {};

    NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
    int[] actual = negativeOnTheRight.negativeOnTheRight(test);

    Assertions.assertArrayEquals(expected,actual);

  }






}
