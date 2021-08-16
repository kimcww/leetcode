import java.util.*;

public class Q11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String data = "KSTTTSEEKFKKKDJJGG";
        String result = "";
        //char current = Character.MIN_VALUE;
        int count = 1;
        for(int i =0; i <data.length() ; i++)
        {
            if(data.charAt(i) == data.charAt(i+1))
                count++;
            else
            {
                result += Character.toString(data.charAt(i));
                if( count >1)
                    result += Integer.toString(count);
                count = 1;
            }

            if((i+1) == data.length()-1)
            {
                result += Character.toString(data.charAt(i+1));
                if( count > 1 )
                    result += Integer.toString(count);
                break;
            }

        }


//        for(int i = 0; i <data.length();i++)
//        {
//            if(i == 0)
//                current = data.charAt(i);
//            else if(current == data.charAt(i))
//                count++;
//            else
//            {
//                result+=Character.toString(current);
//                if(count > 1)
//                    result+=Integer.toString(count);
//                current = data.charAt(i);
//                count = 1;
//            }
//        }
        System.out.print(result);
        in.close();
    }
}
