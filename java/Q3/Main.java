import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s = in.nextLine();
    String[] array = s.split(" ");
    
    int max = Integer.MIN_VALUE;
    String result = "";
    for( String T : array)
    {
      if(max < T.length())
        {
          max = T.length();
          result = T;
        }
    }
    System.out.print(result);
    return ;
  }
}