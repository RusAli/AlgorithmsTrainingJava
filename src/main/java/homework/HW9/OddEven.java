package homework.HW9;

public class OddEven {

  public String oddEven(int number) {
    if(number < Integer.MAX_VALUE && number > Integer.MIN_VALUE) {
      if(number < 0){
        number *= (-1);
      }
      if (number % 2 == 1) {
        return "Odd";
      } else if (number % 2 == 0) {
        return "Even";
      }
    }

    return "Undefined";

  }
}
