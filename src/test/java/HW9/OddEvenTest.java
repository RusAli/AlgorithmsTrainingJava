package HW9;

import homework.HW9.OddEven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

  @Test
  public void testOdd(){
    int n = -345;
    String expectedResult = "Odd";

    OddEven oddEven = new OddEven();
    String actualResult = oddEven.oddEven(n);

    Assertions.assertEquals(expectedResult, actualResult);

  }

  @Test
  public void testEven(){
    int n = 222222;
    String expectedResult = "Even";

    OddEven oddEven = new OddEven();
    String actualResult = oddEven.oddEven(n);

    Assertions.assertEquals(expectedResult, actualResult);

  }

  @Test
  public void testZero(){
    int n = 0;
    String expectedResult = "Even";

    OddEven oddEven = new OddEven();
    String actualResult = oddEven.oddEven(n);

    Assertions.assertEquals(expectedResult, actualResult);

  }

  @Test
  public void testUndefined(){
    int n = 2147483647+1;
    String expectedResult = "Undefined";

    OddEven oddEven = new OddEven();
    String actualResult = oddEven.oddEven(n);

    Assertions.assertEquals(expectedResult, actualResult);

  }



}
