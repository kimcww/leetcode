import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] arr1 = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr1[i] = in.nextInt();
        }
        cnt = in.nextInt();
        int[] arr2 = new int[cnt];
        for(int j = 0; j <cnt; j ++){
            arr2[j] = in.nextInt();
        }

        int [] newArray = new int[arr1.length + arr2.length];    // array 합치기
        System.arraycopy( arr1, 0, newArray, 0, arr1.length);
        System.arraycopy( arr2, 0, newArray, arr1.length, arr2.length );

        Arrays.sort(newArray);  // array 정렬
        for(int i = 0; i < newArray.length; i++)
            System.out.print(newArray[i] + " ");
    }
}