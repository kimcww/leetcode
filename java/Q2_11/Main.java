import java.util.*;

public class Q2_11 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n+1][6];
        for(int i =1; i<= n; i++)
        {
            for(int j = 1; j<=5; j++)
            {
                array[i][j] = in.nextInt();
            }
        }
        int max = 0;
        int human = 0;

        for(int i = 1; i<=n; i++){
            int count = 0;
            for(int j = 1; j<=n; j++)
            {
                for(int k =1; k <=5; k++){
                    if(array[i][k] == array[j][k])
                    {
                        count++;
                        break;
                    }
                }
            }
            if(max<count)
            {
                max = count;
                human = i;
            }
        }
        System.out.print(human);
    }
}
