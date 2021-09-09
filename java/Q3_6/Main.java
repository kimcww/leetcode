import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int k = in.nextInt();
        
        int[] data = new int[input];
        
        for(int i = 0; i<input; i ++){
            data[i] = in.nextInt();
        }
        
        int result =0;
        int count = 0;
        int lt = 0;
        for(int rt = 0 ; rt < input ; rt++){
            if(data[rt] == 0) count++;
            while(count > k){
                if(data[lt] == 0)
                    count--;
                lt++;
            }
            result= Math.max(result, rt-lt+1);
        }
        System.out.print(result);
    }
}