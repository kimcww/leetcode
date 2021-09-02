import java.util.*;

public class Q3_3 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] data = new int[n+3];
        for(int i = 1; i<=n; i++)
            data[i] = in.nextInt();

        int max = 0;
        for(int i = 1; i<=n; i++)
        {
            int threeDays = 0;
            for(int j = 0; j<k; j++)
                threeDays+=data[i+j];

            if(max < threeDays)
                max = threeDays;
        }
        System.out.print(max);
    }
}
