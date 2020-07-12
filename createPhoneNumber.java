public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    
    String phoneNumber = ""; 
    
    for( int i = 0; i < numbers.length; i++ ) {
         switch (i) {
            case 0:  phoneNumber += "(" + numbers[i];
                     break;
            case 1:  phoneNumber += numbers[i];
                     break;
            case 2:  phoneNumber += numbers[i] + ")";
                     break;
            case 3:  phoneNumber += " " + numbers[i];
                     break;
            case 4:  phoneNumber += numbers[i];
                     break;
            case 5:  phoneNumber += numbers[i] + "-";
                     break;
            case 6:  phoneNumber += numbers[i];
                     break;
            case 7:  phoneNumber += numbers[i];
                     break;
            case 8:  phoneNumber += numbers[i];
                     break;
            case 9:  phoneNumber += numbers[i];
                     break;

        }

    }
    return phoneNumber;
  }
}
