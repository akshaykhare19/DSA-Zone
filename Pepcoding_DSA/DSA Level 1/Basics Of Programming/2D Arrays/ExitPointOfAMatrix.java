/*

Exit Point Of A Matrix

easy

1. You are given a number n, representing the number of rows.

2. You are given a number m, representing the number of columns.

3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.

4. Consider this array a maze and a player enters from top-left corner in east direction.

5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.

6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
Constraints

1 <= n <= 10^2

1 <= m <= 10^2

e1, e2, .. n * m elements belongs to the set (0, 1)
Format
Input

A number n

A number m

e11

e12..

e21

e22..

.. n * m number of elements
Output

row

col (of the point of exit)
Example

Sample Input

4

4

0

0

1

0

1

0

0

0

0

0

0

0

1

0

1

0
Sample Output

1

3

*/

import java.util.Scanner;

public class ExitPointOfAMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        //East = 0
        //South = 1
        //West = 2
        //North = 3
        int dir = 0, row = 0, col = 0, exitRow = 0, exitCol = 0;

        while(true)
        {
            int ele = a[row][col];
            dir = (dir + ele) % 4;
            exitRow = row;
            exitCol = col;

            switch(dir)
            {
                case 0 :
                    col++;
                    break;

                case 1 :
                    row++;
                    break;

                case 2 :
                    col--;
                    break;

                case 3 :
                    row--;
                    break;
            }
            if(row < 0 || row >= n || col < 0 || col >= m) break;
        }
        System.out.println(exitRow + "\n" + exitCol);
        sc.close();
    }    
}
