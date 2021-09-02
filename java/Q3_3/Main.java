import java.util.*;

public class Q3_3_1 {
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
            if(i < k)
                sum += arr[i];
        }
        max = sum;
        for(int i = k; i < n; i++)
        {
            sum = sum+arr[i]-arr[i-k];
            if(max < sum)
                max = sum;
        }
        System.out.print(max);
    }
}
