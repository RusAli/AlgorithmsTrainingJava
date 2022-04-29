package HW9;

import homework.HW9.BiggerValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

  @Test
  public void testBiggerValue(){
    int num1 = 3333;
    int num2 = 9999;
    int expected = 9999;

    BiggerValue biggerValue = new BiggerValue();
    int actual = biggerValue.biggerValue(num1,num2);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testBiggerValueWithEquilsNum(){
    int num1 = 3333;
    int num2 = 3333;
    int expected = 3333;

    BiggerValue biggerValue = new BiggerValue();
    int actual = biggerValue.biggerValue(num1,num2);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testBiggerValueWithNegativeNum(){
    int num1 = -1;
    int num2 = -5;
    int expected = -1;

    BiggerValue biggerValue = new BiggerValue();
    int actual = biggerValue.biggerValue(num1,num2);

    Assertions.assertEquals(expected,actual);

  }





}
