import java.util.*;

public class Q13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int current = Integer.MIN_VALUE;
        for(int i = 0; i < count; i++){
            int now = in.nextInt();
            if(current < now)
                System.out.print(now + " ");
            current = now;
        }
    }
}
