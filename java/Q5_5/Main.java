import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String data = in.next();
        Stack<Character> temp = new Stack<>();
        int result = 0;
        for(int i = 0; i< data.length(); i++){
            if(data.charAt(i) == '(')
                temp.push(data.charAt(i));
            else if(data.charAt(i) == ')'){
                if(data.charAt(i-1) == '(')
                {
                    temp.pop();
                    result += temp.size();
                }
                else {
                    temp.pop();
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}