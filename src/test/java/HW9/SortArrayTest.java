package HW9;

import homework.HW9.SortArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

  @Test
  public void testSortArray(){
    int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int[] expected = {2, 3, 4, 4, 5, 7, 9, 12, 12};

    int[] actual = SortArray.sortArray(arr);

    Assertions.assertArrayEquals(expected,actual);
  }


  @Test
  public void testSortEmptyArray(){
    int[] arr = {};
    int[] expected = {};

    int[] actual = SortArray.sortArray(arr);

    Assertions.assertArrayEquals(expected,actual);
  }
}
