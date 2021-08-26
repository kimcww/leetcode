import java.util.*;

public class Q2_8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int score[] = new int[count];
        for(int i = 0 ; i < count ; i ++){
            score[i] = in.nextInt();
        }
        for(int i = 0; i < count ; i ++){
            int level = 1;
            for(int j = 0; j<count; j++)
            {
                if(score[i] < score[j])
                    level++;
            }
            System.out.print(level + " ");
        }
    }
}
