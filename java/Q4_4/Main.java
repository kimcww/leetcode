import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in  = new Scanner(System.in);
        String S = in.next();
        String T = in.next();

        HashMap<Character, Integer> HS = new HashMap<>();
        HashMap<Character, Integer> HT = new HashMap<>();
        int count = 0;
        for(Character c : T.toCharArray())
            HT.put(c, HT.getOrDefault(c,0) + 1);
        int lt = 0;

        for(int rt = 0 ; rt < S.length(); rt++)
        {
            HS.put(S.charAt(rt), HS.getOrDefault(S.charAt(rt),0) + 1);
            if(rt -lt +1 == T.length())
            {
                boolean result = true;
                for(Character checker : HT.keySet())
                {
                    if(!HS.containsKey(checker) || HS.get(checker) != HT.get(checker))
                    {
                        result = false;
                        break;
                    }
                }
                if(result)
                    count++;
                HS.put(S.charAt(lt), HS.get(S.charAt(lt)) -1);

                if(HS.get(S.charAt(lt)) ==0)
                    HS.remove(S.charAt(lt));
                lt++;
            }
        }
        System.out.print(count);
    }
}