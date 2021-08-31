import java.util.*;

public class Q3_2_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cnt1 = in.nextInt();
        int[] arr1 = new int[cnt1];
        for(int i =0; i < cnt1; i++)
            arr1[i] = in.nextInt();

        int cnt2 = in.nextInt();
        int[] arr2 = new int[cnt2];
        for(int i =0; i < cnt2; i++)
            arr2[i] = in.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> result = new ArrayList<>();

        int p1 =0, p2 = 0;
        while(p1 <cnt1 && p2<cnt2)
        {
            if(arr1[p1] == arr2[p2])
            {
                result.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1] < arr2[p2])
                p1++;
            else if(arr1[p1] > arr2[p2])
                p2++;
        }
        for(Integer a : result)
            System.out.print(a+ " ");

    }
}
