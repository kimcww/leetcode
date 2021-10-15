import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] array = new int[n];

        for(int i = 0 ; i < m ; i++){
            int work = in.nextInt();
            boolean isExist = false;

            for(int j = n-1; j >0; j--){
                if(array[j] == work)
                    isExist = true;
            }

            for(int j = n-1; j >0; j--)
            {
                if(isExist){
                    if(array[j] == work){
                        for(int k = j; k>0; k--){
                            array[k] = array[k-1];
                        }
                        break;
                    }
                }
                else{
                    array[j] = array[j-1];
                }
            }
            array[0] = work;
        }
        for(int a : array)
            System.out.print(a+" ");
    }
}