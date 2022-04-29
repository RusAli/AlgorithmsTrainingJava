package HW9;

import homework.HW9.AreNumbersEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

  @Test
  public void testAreNumbersEqualWithEqualsNums(){
    int num1 = 89;
    int num2 = 89;
    int expected = 0;

    AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
    int actual = areNumbersEqual.areNumbersEqual(num1,num2);

    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testAreNumbersEqualWithFirstNegativeAndSecondPositive(){
    int num1 = -89;
    int num2 = 89;
    int expected = -1;

    AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
    int actual = areNumbersEqual.areNumbersEqual(num1,num2);

    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testAreNumbersEqualWithFirstPositiveAndSecondNegative(){
    int num1 = 89;
    int num2 = -89;
    int expected = 1;

    AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
    int actual = areNumbersEqual.areNumbersEqual(num1,num2);

    Assertions.assertEquals(expected,actual);
  }






}
