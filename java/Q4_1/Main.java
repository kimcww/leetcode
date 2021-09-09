import java.util.*;

public class Q4_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String data = in.next();
        HashMap<Character , Integer> map = new HashMap<Character,Integer>();
        Character result = Character.MIN_VALUE;
        int max = 0;
        for(int i = 0; i< data.length(); i++)
        {
            int current = 0;
            Character key=  data.charAt(i);
            if(map.containsKey(key) == true)
                current = map.get(key);
            if(max < current +1)
            {
                max = current +1;
                result = key;
            }
            map.put(key, current +1);
        }
        System.out.print(result);
    }
}
