import java.util.*;
public class RotateBy90
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        rotationByNinety(a);
        sc.close();
    }

    public static void rotationByNinety(int[][] a)
    {
        //transpose
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a[0].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        int l = 0, r = a[0].length-1;
        while(l <= r){
            for(int i = 0; i < a.length; i++){
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp;
            }
            l++;
            r--;
        }

        display(a);

    }

    public static void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}