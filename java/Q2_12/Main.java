import java.util.*;

public class Q2_12_1 {
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
        int pair = 0;       // 멘토, 멘티 갯수 파악

        for(int i = 1; i <= member; i++)
        {
            for(int j = 1; j <= member; j++)
            {
                boolean mentor = true;      // i 와 j 가 짝인지를 판단하기위한
                for(int k = 1; k <= exam; k++){
                    int iScore = 0;         // i score 와 j score 를 exam 모두 돌면서 한번이라도 i(멘토) 보다 j(멘티) 가 순위가
                    int jScore = 0;         // 높을 경우 mentor false 를 return 해준다
                    for(int n = 1; n <= member; n++)
                    {
                        if(array[k][n] == i)
                            iScore = n;
                        if(array[k][n] == j)
                            jScore = n;
                    }
                    if(iScore <= jScore)
                    {
                        mentor = false;
                        break;
                    }
                }
                if(mentor)
                    pair++;
            }
        }
        System.out.print(pair);
    }
}
