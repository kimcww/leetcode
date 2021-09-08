import java.util.*;

public class Q3_5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int start = 1;
        while(start < n)
        {
            int sum = 0;
            for(int i = start ; i<n ; i++){
                sum += i;
                if(sum > n)
                    break;
                else if( sum == n)
                    count++;
            }
            start++;
        }
        System.out.print(count);
    }
}
