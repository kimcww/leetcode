import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Stack<String> store = new Stack<>();
        for(char a : input.toCharArray())
        {
            if(!(a == '+' || a == '*' || a== '/' || a== '-'))
                store.push(Character.toString(a));
            else{
                int one = Integer.parseInt(store.pop());
                int two = Integer.parseInt(store.pop());
                if(a == '+')
                    store.push(Integer.toString(two + one));
                else if(a == '*')
                    store.push(Integer.toString(two * one));
                else if(a == '-')
                    store.push(Integer.toString(two - one));
                else if(a == '/')
                    store.push(Integer.toString(two / one));
            }
        }
        System.out.print(store.pop());
    }
}