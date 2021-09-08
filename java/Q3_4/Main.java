import java.util.*;

public class Q3_4 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] data = new int[n];
        int count = 0;
        for(int i = 0; i <n; i++)
            data[i] = in.nextInt();

        for(int i = 1; i <n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)      
            {
                sum += data[j];
                if(sum == m)
                    count++;
                else if( sum > m)
                    break;
            }
        }
        System.out.print(count);
    }
}
