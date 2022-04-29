package homework.HW9;

public class IsGoodNumber {

  public static String isGoodNumber(int num){
    if(num % 3 == 0 && num % 5 == 0){
      return "Good Number";
    }else if(num % 3 == 0 && num % 5 != 0){
      return "Bad Number";
    }else if(num % 3 != 0 && num % 5 == 0){
      return "Poor Number";
    }else{
      return "-1";
    }
  }
}
