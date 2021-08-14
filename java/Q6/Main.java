import java.util.*;
  
public class Main {
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String data = in.next();
        Map<Character, Integer> group = new LinkedHashMap<Character, Integer>();
        for(int i = 0; i < data.length(); i++)
        {
            int count = group.containsKey(data.charAt(i)) ? group.get(data.charAt(i)) : 0;
            group.put(data.charAt(i), count + 1);
        }
        for(Character key : group.keySet())
            System.out.print(key);
    return ;
  }
}