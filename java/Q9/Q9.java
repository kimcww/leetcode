import java.util.*

public class Q9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String data = in.next();
        String result = "";
        int res = 0;
        for(Character a : data.toCharArray())
        {
            if(48<= a && a<=57)
                result+=a;
        }
        System.out.print(res = Integer.parseInt(result));
    }
}
