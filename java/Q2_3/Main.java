import java.util.*;

public class Q14 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] A = new int[count];
        int[]B = new int[count];
        for(int i = 0 ; i < count ; i++)
            A[i] = in.nextInt();
        for(int i = 0; i < count ; i++) {
            B[i] = in.nextInt();

        if(A[i] == B[i])
            System.out.println('D');
        else if((A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 3) || (A[i] == 3 && B[i] == 1 ))
            System.out.println('B');
        else
            System.out.println('A');
        }
    }
}
