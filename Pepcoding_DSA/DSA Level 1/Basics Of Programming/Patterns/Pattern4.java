/*

Pattern 4

easy

1. You are given a number n.

2. You've to create a pattern of * and separated by tab as shown in output format.
Constraints

1 <= n <= 100
Format
Input

A number n
Output

pat41
Example

Sample Input

5
Sample Output

*	*	*	*	*	

	*	*	*	*	

		*	*	*	

			*	*	

				*

*/

import java.util.*;

public class Pattern4
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int noOfSpaces = 0;
        int noOfStars = n;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < noOfSpaces; j++){
                System.out.print("\t");
            }
            for(int k = 0; k < noOfStars; k++){
                System.out.print("*\t");
            }
            noOfSpaces++;
            noOfStars--;
            System.out.println();
        }
        scn.close();

    }
}
