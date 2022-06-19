import java.util.Scanner;

/*

3

4

11

12

13

14

21

22

23

24

31

32

33

34

*/

public class SpiralDisplay
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int rmin = 0, rmax = m-1;
        int cmin = 0, cmax = n-1;
        int count = 0;

        while(count < m*n){
            
            //left
            for(int row = rmin; row <= rmax && count < m*n; row++){
                System.out.println(a[row][cmin]);
                count++;
            }
            cmin++;

            //bottom
            for(int col = cmin; col <= cmax && count < m*n; col++){
                System.out.println(a[rmax][col]);
                count++;
            }
            rmax--;

            //right
            for(int row = rmax; row >= rmin && count < m*n; row--){
                System.out.println(a[row][cmax]);
                count++;
            }
            cmax--;

            //top
            for(int col = cmax; col >= cmin && count < m*n; col--){
                System.out.println(a[rmin][col]);
                count++;
            }
            rmin++;
        }
        sc.close();
    }
}
