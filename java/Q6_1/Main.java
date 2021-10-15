import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i] = in.nextInt();
        }
        for(int i = 0; i< n; i++){
            int min = array[i];
            int current = i;
            for(int j = i; j < n; j++){
                if(min>array[j])
                {
                    min = array[j];
                    current = j;
                }
            }
            int temp = array[i];
            array[i] = array[current];
            array[current] = temp;
        }
        for(int a : array){
            System.out.print(a+" ");
        }
    }
}