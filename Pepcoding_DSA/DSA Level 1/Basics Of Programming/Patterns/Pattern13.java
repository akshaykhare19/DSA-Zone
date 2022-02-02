/*

Pattern 13

easy

1. You are given a number n.

2. You've to create a pattern as shown in output format

                                 

                                

                               

                               
Constraints

1 <= n <= 10
Format
Input

A number n
Output

pat131
Example

Sample Input

5
Sample Output

1	

1	1	

1	2	1	

1	3	3	1	

1	4	6	4	1	

*/

import java.util.*;

public class Pattern13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int icj = 1;
            for(int j = 0; j <= i; j++)
            {
                System.out.print(icj + "\t");
                icj = icj * (i-j)/(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}

//nc(r+1) = (n-r)/(r+1) * ncr