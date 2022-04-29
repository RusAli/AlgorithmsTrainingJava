package HW9;

import homework.HW9.IsPositiveNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

  @Test
  public void isPositiveNumberPositive(){
    int num = 555;
    boolean expected = true;

    IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
    boolean actual = isPositiveNumber.isPositiveNumber(num);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void isPositiveNumberNegative(){
    int num = -555;
    boolean expected = false;

    IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
    boolean actual = isPositiveNumber.isPositiveNumber(num);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void isPositiveNumberZero(){
    int num = 0;
    boolean expected = true;

    IsPositiveNumber isPositiveNumber = new IsPositiveNumber();
    boolean actual = isPositiveNumber.isPositiveNumber(num);

    Assertions.assertEquals(expected,actual);

  }






}
