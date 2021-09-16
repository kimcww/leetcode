import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        HashMap<Integer, Integer> data = new HashMap<>();
        int lt = 0;
        int result = 0 ;
        int[] arr = new  int[n];
        for(int rt = 0; rt < n; rt ++)
        {
            int input = in.nextInt();
            arr[rt] = input;
            data.put(input, data.getOrDefault(input,0) +1);
            if(rt-lt+1 == k)
            {
                System.out.print(data.size() + " ");
                data.put(arr[lt] , data.get(arr[lt]) -1 );
                if(data.get(arr[lt]) == 0)
                    data.remove(arr[lt]);
                lt++;
            }
        }
    }
}