import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        
        for(int i = 0; i < count ; i++)
        {
            String input = in.next();
            StringBuilder sb = new StringBuilder(input);
            input = sb.reverse().toString();
            int result = Integer.parseInt(input);
            if(result == 2)
                System.out.print(result + " ");
            for(int j = 2; j < result ; j++)
            {
                if(result%j == 0)
                    break;
                if(j == result-1)
                    System.out.print(result + " ");
            }
        }
    }
}