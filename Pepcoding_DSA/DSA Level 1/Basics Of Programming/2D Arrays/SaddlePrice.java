/*

Saddle Price

easy

1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 

2. You are required to find the saddle price of the given matrix and print the saddle price. 

3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Constraints

1 <= n <= 10^2

-10^9 <= e11, e12, .. n * m elements <= 10^9
Format
Input

A number n

e11

e12..

e21

e22..

.. n * n number of elements of array a
Output

Saddle point of the matrix if available or "Invalid input" if no saddle point is there.
Example

Sample Input

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

41

42

43

44
Sample Output

41

*/
import java.util.Scanner;

public class SaddlePrice
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
        sc.close();
        
        for(int i = 0; i < n; i++){

            int minInRow = a[i][0];
            int colNo = 0;
            for(int col = 0; col < n; col++){
                if(a[i][col] < minInRow){
                    minInRow = a[i][col];
                    colNo = col;
                }
            }

            boolean isSaddle = true;
            for(int row = 0; row < n; row++){
                if(a[row][colNo] > minInRow){
                    isSaddle = false;
                    break;
                }
            }

            if(isSaddle){
                System.out.println(minInRow);
                return;
            }
        }
        System.out.println("Invalid input");
    }    


}
