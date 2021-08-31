import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String check = in.next();
    for( char a : check.toCharArray())
    {
      if(Character.isUpperCase(a))
        a = Character.toLowerCase(a);
      else
        a = Character.toUpperCase(a);
      System.out.print(a);
    } 
    return ;
  }
}