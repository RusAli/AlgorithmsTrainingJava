package homework.HW9;

public class SumArray {

  public int sumArray(int[] array){

    int sum = 0;

    if(array != null && array.length >0 ){

      for (int i = 0; i < array.length; i++) {
        sum +=  array[i];
      }
      return sum;

    }else{
      return sum;
    }

  }
}
