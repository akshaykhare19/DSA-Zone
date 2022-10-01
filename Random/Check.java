import java.util.*;
public class Check
{
    public static void main(String args[])
    {
        int s = 057;
        System.out.println("Before conversion: " + s);


        int arr[][] = {{1,1000}, {1,999}, {1,998}};

        Arrays.sort(arr, (a,b) -> a[0]!=b[0] ? a[0]-b[0] : a[1]-b[1]);

        for(int ele[] : arr){
            System.out.println(ele[0] + " -> " + ele[1]);
        }

    }
}