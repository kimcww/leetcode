import java.util.*;

class Person
{
    public int id;
    public int dangerous;
    public Person(int input , int input2)
    {
        id = input;
        dangerous = input2;
    }
};

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0 ;
        Queue<Person> patient = new LinkedList<>();

        for(int i = 0 ;i < n ; i++)
            patient.offer(new Person(i , in.nextInt()));

        while(!patient.isEmpty())
        {
            int max = 0;
            for(Person a : patient) {
                if (max < a.dangerous)
                    max = a.dangerous;
            }
            for(int i = 0 ; i< patient.size(); i ++){
                Person current = patient.poll();
                if(max <= current.dangerous)
                {
                    if(current.id == m)
                    {
                        System.out.print(++count);
                        break;
                    }
                    else
                    {
                        count++;
                        break;
                    }
                }
                else
                    patient.add(current);
            }
        }

    }
}