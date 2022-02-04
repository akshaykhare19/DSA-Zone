/*

Pattern 18

easy

       1. You are given a number n.

      2. You've to write code to print the pattern given in output format below

                                  

                                 

                                

                               

                               

                               

                               
Constraints

1 <= n <= 10

 Also, n is odd.
Format
Input

A number n
Output

pat181
Example

Sample Input

7

Sample Output

*	*	*	*	*	*	*	

	*				*	

		*		*	

			*	

		*	*	*	

	*	*	*	*	*	

*	*	*	*	*	*	*	



*/

import java.util.*;

public class Pattern18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n;
        int nsp = 0;

        for(int i = 1; i <= n; i++)
        {
            //nsp
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("\t");
            }

            //nst
            for(int j = 1; j <= nst; j++)
            {
                if(i >= 2 && i <= n/2 && j != 1 && j != nst){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }

            if(i <= n/2){
                nst-=2;
                nsp++;
            }
            else {
                nst+=2;
                nsp--;
            }
            System.out.println();
        }
        sc.close();
    }
}
