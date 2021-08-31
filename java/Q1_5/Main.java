import java.util.*;
  
public class Main {
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Queue<Character> str = new LinkedList<Character>();
        char[] data = input.toCharArray();
        for(int i =0 ; i < data.length; i++)
        {
            char a = data[i];
            if((65<=a && a<=90) || (97<=a && a<=122)) // alphabet
            {
                str.add(a);
                data[i] = Character.MIN_VALUE;
            }
        }
        for(int i = data.length -1; i >=0; i--)
        {
            if(data[i] == Character.MIN_VALUE)
                data[i] = str.poll();
        }
        System.out.print(data);
    return ;
  }
}