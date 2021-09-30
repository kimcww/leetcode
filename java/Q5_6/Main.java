import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Queue<Integer> prince = new LinkedList<>();
        for(int i = 1 ; i <= n ; i++)
            prince.add(i);

        int count = 0 ;
        while(prince.size() != 1){
            count++;
            if(count == k){
                prince.poll();
                count = 0;
            }
            else{
                prince.add(prince.poll());
            }
        }
        System.out.print(prince.poll());
    }
}