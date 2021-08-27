import java.util.*;

public class Q2_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        int max = 0;
        for(int i = 0; i <n ; i++)
        {
            for(int j = 0; j < n; j++)
              array[i][j] = in.nextInt();
        }

        int lCrossSum = 0;
        int rCrossSum = 0;
        for(int i = 0; i < n; i++)
        {
            int rowSum = 0;
            int colSum = 0;
            for(int j = 0; j < n; j++)
            {
                rowSum += array[i][j];
                colSum += array[j][i];
            }
            lCrossSum += array[i][i];
            rCrossSum += array[n-1-i][i];
            if(max < rowSum)
                max = rowSum;
            if(max < colSum)
                max = colSum;
        }
        if(max < lCrossSum)
            max = lCrossSum;
        if(max < rCrossSum)
            max = rCrossSum;
        System.out.print(max);
    }

}
