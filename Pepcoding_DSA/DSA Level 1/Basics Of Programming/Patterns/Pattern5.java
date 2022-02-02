/*

Pattern 5

easy

1. You are given a number n.

2. You've to create a pattern of * and separated by tab as shown in output format.
Constraints

1 <= n <= 100

 Also, n is odd.
Format
Input

A number n
Output

pat51
Example

Sample Input

5
Sample Output

		*	

	*	*	*	

*	*	*	*	*	

	*	*	*	

		*	

*/


import java.util.*;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int noOfSpaces = n/2;
        int noOfStars = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= noOfSpaces; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= noOfStars; k++){
                System.out.print("*\t");
            }
            if(i <= n/2){
                noOfSpaces--;
                noOfStars+=2;
            }
            else{
                noOfSpaces++;
                noOfStars-=2;
            }
            System.out.println();
        }
        scn.close();

    }
}
