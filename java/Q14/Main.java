import java.util.*;

public class Q14 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int maxTall = 0;
        int result = 0;
        for(int i = 0; i < count ; i ++){
            int t = in.nextInt();
            if(maxTall < t)
            {
                result++;
                maxTall = t;
            }
        }
        System.out.print(result);
    }
}
