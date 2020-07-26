import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
    String[] array1 = numbers.split(" ");
    List<Integer> intList = new ArrayList<>();
    String highNumber;
    String lowNumber;
    String highAndLowNumber;
    
    for ( String number : array1) {
      intList.add(Integer.parseInt(number));
    }
    Collections.sort(intList);
    
    highNumber = String.valueOf(intList.get(intList.size()-1));
    lowNumber = String.valueOf(intList.get(0));
    highAndLowNumber = highNumber + " " + lowNumber;
    
    return highAndLowNumber;
  }
}
