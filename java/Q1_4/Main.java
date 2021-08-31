import java.util.*;
  
public class Main {
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        List<String> array =  new ArrayList<String>();
        while(count != 0)
        {
            array.add(in.next());
            count--;
        }
        for(String a: array)
        {
            StringBuffer str = new StringBuffer(a);
            System.out.println(str.reverse().toString());
        }
    return ;
  }
}