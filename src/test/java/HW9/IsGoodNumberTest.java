package HW9;

import homework.HW9.IsGoodNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsGoodNumberTest {

  @Test
  public void testIsGoodNumber(){
    int num = 15;
    String expected = "Good Number";

    String actual = IsGoodNumber.isGoodNumber(num);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testIsBadNumber(){
    int num = 9;
    String expected = "Bad Number";

    String actual = IsGoodNumber.isGoodNumber(num);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testIsPoorNumber(){
    int num = 5;
    String expected = "Poor Number";

    String actual = IsGoodNumber.isGoodNumber(num);

    Assertions.assertEquals(expected,actual);

  }

  @Test
  public void testIsGoodNumberNegative(){
    int num = 1;
    String expected = "-1";

    String actual = IsGoodNumber.isGoodNumber(num);

    Assertions.assertEquals(expected,actual);

  }







}
