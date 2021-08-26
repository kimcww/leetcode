import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int array[] = new int[count];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;

        for(int i = 0 ; i < count; i ++){
            if(i>2)
                array[i] = array[i-1] + array[i-2];
            System.out.print(array[i] + " ");
        }
    }
}