package HW9;

import homework.HW9.OddIndices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {


  @Test
  public void testOddIndices() {
    int[] arr = {-45, 590, 234, 985, 12, 68};
    int[] expected = {590, 985, 68};

    OddIndices oddIndices = new OddIndices();
    int[] actual = oddIndices.oddIndices(arr);

    Assertions.assertArrayEquals(expected,actual);

  }

  @Test
  public void testEmptyArray() {
    int[] arr = {};
    int[] expected = {};

    OddIndices oddIndices = new OddIndices();
    int[] actual = oddIndices.oddIndices(arr);

    Assertions.assertArrayEquals(expected,actual);

  }







}
