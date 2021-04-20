import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    text = text.toLowerCase();
    ArrayList<Character> c = new ArrayList<>();
    
    for ( int i = 0; i < text.length(); i++ ) {
      c.add(text.charAt(i));
    }
    
    Collections.sort(c);
    int count = 0;
    for ( int j = 0; j < c.size(); j++ ) {
      int last = c.lastIndexOf(c.get(j));
      if (last > j) {
        count++;
        j = last; 
      }
    }
    
    
    return count;
  }
}
