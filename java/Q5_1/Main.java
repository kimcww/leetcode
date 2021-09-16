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
            {
                if(data.empty()){
                    System.out.print("NO");
                    return;
                }
                else
                    data.pop();
            }
        }
        if(!data.empty())
            System.out.print("NO");
        else
            System.out.print("YES");
        
    }
}