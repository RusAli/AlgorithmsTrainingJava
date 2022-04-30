package HW9;

import homework.HW9.KthLargest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

  @Test
  public void testKthLargest(){
    int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int index = 3;
    int expected = 9;

    KthLargest kthLargest = new KthLargest();
    int actual = kthLargest.kthLargest(arr,index);

    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testKthLargestWithEmptyArr(){
    int[] arr = {};
    int index = 3;
    int expected = 0;

    KthLargest kthLargest = new KthLargest();
    int actual = kthLargest.kthLargest(arr,index);

    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testKthLargestWithInvalidIndex(){
    int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
    int index = -3;
    int expected = 0;

    KthLargest kthLargest = new KthLargest();
    int actual = kthLargest.kthLargest(arr,index);

    Assertions.assertEquals(expected,actual);
  }
}
