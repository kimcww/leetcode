import java.util.*;

public class Main {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int score = 0;
    int result = 0;
    for(int i = 0; i < count; i++)
    {
        if(Integer.parseInt(in.next()) == 0)
            score = 0;
        else
        {
            score++;
            result += score;
        }
    }
    System.out.print(result);
       
    }
}