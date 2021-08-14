import java.util.*;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
	String a = in.next();
    char b = in.next().charAt(0);
    int count =0;
    a = a.toUpperCase();
    b = Character.toUpperCase(b);
    for(int i = 0; i < a.length() ; i++)
    {
      if(a.charAt(i) == b)
        count++;
    }
    System.out.print(count);
    return ;
  }
}