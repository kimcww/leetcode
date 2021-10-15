import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n ; i++)
        {
            int value = in.nextInt();
            if(list.contains(value))
            {
                System.out.print("D");
                return;
            }
            else
                list.add(value);
        }
        System.out.print("U");
    }
}