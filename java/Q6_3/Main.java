import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i =0 ; i <n; i++){
            array[i] = in.nextInt();
        }

        for(int i = 1 ; i < n; i++){
            int temp = array[i];
            int j = i;
            while(j>0 && temp < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
        for(int a : array)
            System.out.print(a + " ");
    }
}