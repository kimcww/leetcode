import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] data = new int[n];
        TreeSet<Integer> sumData = new TreeSet<Integer>(Collections.reverseOrder());
        for(int i = 0; i < n; i++)
        {
            data[i] = in.nextInt();
        }
        
        for(int i = 0 ; i < n; i ++)
        {
            for(int j = i+1; j<n ; j++)
            {
                for(int h = j+1; h<n; h++){
                    sumData.add(data[i] + data[j] + data[h]);
                }
            }
        }
        int count = 0;
        for(int a : sumData)
        {
            count++;
            if(count == k)
                System.out.print(a);    
        }
        if(count < k)
            System.out.print(-1);
    }
}