package HW9;

import homework.HW9.Intersection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {

  @Test
  public void testIntersectionWithPositive(){
    int[] arr1 ={1, 2, 4, 5, 89};
    int[] arr2 ={8, 9, 4, 2};
    int[] excepted = {2,4};

    int[] actual = Intersection.intersection(arr1,arr2);

    Assertions.assertArrayEquals(excepted,actual);
  }

  @Test
  public void testIntersectionWithNegative(){
    int[] arr1 ={1, 2, 4, 5, 8, 9};
    int[] arr2 ={8, 9, -4, -2};
    int[] excepted = {8, 9};

    int[] actual = Intersection.intersection(arr1,arr2);

    Assertions.assertArrayEquals(excepted,actual);
  }

  @Test
  public void testIntersectionWithoutSameNumbers(){
    int[] arr1 ={1, 2, 4, 5, 89};
    int[] arr2 ={8, 9, 45};
    int[] excepted = {};

    int[] actual = Intersection.intersection(arr1,arr2);

    Assertions.assertArrayEquals(excepted,actual);
  }

   @Test
  public void testIntersectionWithEmptyArrays(){
    int[] arr1 ={};
    int[] arr2 ={};
    int[] excepted = {};

    int[] actual = Intersection.intersection(arr1,arr2);

    Assertions.assertArrayEquals(excepted,actual);
  }













}
