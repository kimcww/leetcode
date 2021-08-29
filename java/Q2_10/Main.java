import java.util.*;

public class Q2_10 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int[][] array = new int[n+2][n+2];
        int[] dx = new int[]{-1,0,1,0}; // 좌
        // ,상,우,하 기준으로 dx dy 를 만든다
        int[] dy = new int[]{0,-1,0,1};
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1 ; j <=n; j++)
                array[i][j] = in.nextInt();
        }
        for(int i = 1; i<= n; i++)
        {
            for(int j = 1 ; j <=n; j++)
            {
                boolean top = true;
                for(int rotate = 0; rotate < 4; rotate++){
                    if(array[i][j] <= array[i +dx[rotate]][j + dy[rotate]]) // rotate 돌면서 하나라도 같거나 크면 false뱉는다
                        top = false;
                }
                if(top == true)
                    count++;
            }
        }
        System.out.print(count);
    }
}
