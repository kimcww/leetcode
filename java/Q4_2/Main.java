import java.util.*;

public class Q4_2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String input2 = in.next();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character a: input.toCharArray())
        {
            int current = 0;
            if(map1.containsKey(a) == true)
                current = map1.get(a);
            map1.put(a, current+1);
        }
        for(Character a: input2.toCharArray())
        {
            int current = 0;
            if(map2.containsKey(a) == true)
                current = map2.get(a);
            map2.put(a, current+1);
        }
        boolean result = true;
        for(Character a : map1.keySet())
        {
            if(map2.containsKey(a) == false)
            {
                result = false;
                break;
            }
            else if(map2.get(a) != map1.get(a))
            {
                result = false;
                break;
            }
        }
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}
