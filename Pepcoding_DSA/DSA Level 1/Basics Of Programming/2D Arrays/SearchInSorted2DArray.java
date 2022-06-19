import java.util.Scanner;

public class SearchInSorted2DArray
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int d = sc.nextInt();
        sc.close();

        int i = 0, j = n-1;

        while(i < n && j >= 0){
            if(a[i][j] == d){
                System.out.println(i + "\n" + j);
                return;
            }
            else if(a[i][j] > d){
                j--;
            }
            else if(a[i][j] < d){
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
