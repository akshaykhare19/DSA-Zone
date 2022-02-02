/*

Pattern 6

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

pat61
Example

Sample Input

5
Sample Output

*	*	*		*	*	*	

*	*				*	*	

*						*	

*	*				*	*	

*	*	*		*	*	*	

*/


import java.util.*;

public class Pattern6
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int nst1 = n/2 + 1, nsp = 1, nst2 = n/2 + 1;

        //loop for no. of rows
        for(int i = 1; i <= n; i++){

            //loop for no. of stars on left
            for(int j = 1; j <= nst1; j++){
                System.out.print("*\t");
            }

            //loop for no. of spaces
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }

            //loop for no. of stars on right
            for(int j = 1; j <= nst2; j++){
                System.out.print("*\t");
            }

            if(i <= n/2){
                nst1--;
                nsp+=2;
                nst2--;
            }
            else{
                nst1++;
                nsp-=2;
                nst2++;
            }
            System.out.println();

        }
        scn.close();

    }
}
