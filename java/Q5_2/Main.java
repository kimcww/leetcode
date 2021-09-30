import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack<Character> data = new Stack<Character>();
        
        for(char c : input.toCharArray())
        {
            if(c == '(')
                data.push('(');
            else if(c == ')')
                data.pop();
            else{
                if(data.empty())
                    System.out.print(c);
            }
        }
        
    }
}