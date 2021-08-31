import java.util.*;

public class Q10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String data = in.next();
        String target = in.next();
        
        int distance = 1000;
        int[] result = new int[data.length()];
        for(int i = 0; i < data.length()-1; i++)
        {
            if(data.charAt(i) == target.charAt(0))
                distance = 0;
            else
                distance++;
            result[i] = distance;
        }
        distance = 1000;
        for(int i = data.length()-1; i >=0; i--)
        {
            if(data.charAt(i) == target.charAt(0))
                distance = 0;
            else
                distance++;
            if(result[i] > distance)
                result[i] = distance;
        }
        for(int a =0; a < result.length; a++)
            System.out.print(result[a] + " ");
    }
}
