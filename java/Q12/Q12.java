import java.util.*;

public class Q12 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String data = in.next();
        for(int i = 0 ; i< count; i++)
        {
            String temp = data.substring(0,7).replace('#','1').replace('*', '0');
            System.out.print((char)Integer.parseInt(temp,2));
            data = data.substring(7);
        }
    }
}
