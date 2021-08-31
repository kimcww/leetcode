import java.util.*;

public class Q7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String data = in.next();
        data = data.toUpperCase(Locale.ROOT);
        StringBuffer reverseData = new StringBuffer(data);
        if(data.equals(reverseData.reverse().toString()))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
