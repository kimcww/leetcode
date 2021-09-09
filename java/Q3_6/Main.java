import java.util.*;
//
//알고리즘의 요지 , rt 가 == 0 이면 0의 count 를 +1 하고 k 값보다 count 가 큰지 안큰지 확인한다
//count 가 > k보다 크면 lt 가 ==0 일때까지 따라오면서 0 일때 -1 한다 현재 rt-lt+1 값이 1의 연속 길이
//
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
            result= Math.max(result, rt-lt+1); // rt - lt +1 = 1의 길이
        }
        System.out.print(result);
    }
}