import java.util.Scanner;

public class SearchInSorted2DArray
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

        int d = sc.nextInt();
        sc.close();

        for(int i = 0; i < a.length; i++){
            int l = 0, r = a[i].length-1;
            
            while(l <= r){
                int mid = (l + r)/2;

                if(a[i][mid] == d){
                    System.out.println(i + "\n" + mid);
                    return;
                }

                else if(a[i][mid] > d){
                    r = mid - 1;
                }

                else if(a[i][mid] < d){
                    l = mid + 1;
                }
            }
        }
        System.out.println("Not Found");
    }    
}
