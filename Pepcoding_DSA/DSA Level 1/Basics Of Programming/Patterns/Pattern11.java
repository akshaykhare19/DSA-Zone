/*

Pattern 11

easy

1. You are given a number n.

2. You've to create a pattern as shown in output format.
Constraints

1 <= n <= 44
Format
Input

A number n
Output

pat111
Example

Sample Input

5
Sample Output

1	

2	3	

4	5	6	

7	8	9	10	

11	12	13	14	15

*/

import java.util.*;

public class Pattern11
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int num = 1;
        int nst = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nst; j++){
                System.out.print(num++ + "\t");
            }
            nst++;
            System.out.println();
        }
        scn.close();

    }
}
