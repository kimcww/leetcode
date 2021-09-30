import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String in1 = in.next();
        String in2 = in.next();
        Queue<Character> must= new LinkedList<>();
        Queue<Character> order= new LinkedList<>();
        for(char a : in1.toCharArray()) must.add(a);
        for(char a : in2.toCharArray()){
            if(!must.isEmpty()) {
                if (must.peek() == a)
                    must.poll();
            }
        }
        if(must.isEmpty())
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}