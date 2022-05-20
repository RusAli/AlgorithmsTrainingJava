package HW10;

import homework.HW10.RemoveDuplicates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

  @Test
  public void testRemoveDuplicates(){
    String str = "AABBCCaabbcc";
    String expected = "abc";

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    String actual = removeDuplicates.removeDuplicates(str);

    Assertions.assertEquals(expected,actual);

  }
}
