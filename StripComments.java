import java.util.*;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
    
    StringBuilder sb = new StringBuilder();
    String[] str = text.split("\n");
    List<String> list = Arrays.asList(commentSymbols);
    
      for ( String s : str ) {
        for ( int i = 0; i < list.size(); i++ ) {
          if ( s.contains(list.get(i))) {
            int z = s.indexOf(list.get(i));
            String tempString = s.substring(0,z);
            if ( tempString.endsWith(" ")) {
              tempString = s.substring(0, z-1);
            }
            sb.append(tempString.stripTrailing());
            if ( s != str[str.length - 1]) {
                sb.append("\n");
            }
            i = list.size();
          } else if ( i == (list.size() - 1) && !s.contains(list.get(i))) {
            sb.append(s.stripTrailing());
            if ( s != str[str.length - 1]) {
                sb.append("\n");
            }
          }
        }
      }
    
  
    return sb.toString();
  }
    
}
