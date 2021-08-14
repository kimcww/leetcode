import java.util.*;

public class Q8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toUpperCase();
        int lt = 0, rt = str.length()-1;
        boolean result  = true;
        while(lt<rt)
        {
            if(!(65<=str.charAt(lt) && str.charAt(lt) <=90))
                lt++;
            else if(!(65<=str.charAt(rt) && str.charAt(rt) <=90))
                rt--;
            else
                if(str.charAt(lt) != str.charAt(rt))
                {
                    result = false;
                    break;
                }
                else
                {
                    lt++;
                    rt--;
                }
        }
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
