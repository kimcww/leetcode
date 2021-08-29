import java.util.*;

public class Q2_12 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int member = in.nextInt();
        int exam = in.nextInt();
        int[][] array = new int[exam+1][member+1];

        for(int i = 1; i <= exam; i++){
            for(int j = 1; j <= member; j++){
                array[i][j] = in.nextInt();
            }
        }
        int pair = 0;

        for(int i = 1; i <= member; i++)
        {
            boolean mentor = true;
            for(int j = 1; j <= member; j++)
            {
                for(int k = 1; k <= exam; k++){
                    if(array[k][i] < array[k][j])
                    {
                        mentor =false;
                        break;
                    }
                }
            }
            if(mentor)
                pair++;
        }
        System.out.print(pair);
    }
}
