import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] array = new int[n][n];
        Stack<Integer> store = new Stack<>();
        int count = 0;
        for(int i = 0;  i<n; i++){
            for(int j = 0 ; j < n; j++){
                array[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] motion = new int[m];
        for(int i = 0; i < m; i++)
            motion[i] = in.nextInt();


        for(int a : motion)
        {
            for(int i = 0 ; i < n; i ++)
            {
                if(array[i][a-1] != 0 ){
                    if(!store.isEmpty())
                    {
                        if(store.lastElement() == array[i][a-1])
                        {
                            store.pop();
                            count++;
                        }
                        else{
                            store.push(array[i][a-1]);
                        }
                    }
                    else
                        store.push(array[i][a-1]);
                    array[i][a-1] = 0;
                    break;
                }
            }
        }
        System.out.print(count*2);
    }
}