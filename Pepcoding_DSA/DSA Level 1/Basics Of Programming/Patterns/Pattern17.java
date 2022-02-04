/*

Pattern 17

easy

1. You are given a number n.

2. You've to write code to print the pattern given in output format below.
Constraints

1 <= n <= 10

 Also, n is odd.
Format
Input

A number n
Output

pat171
Example

Sample Input

5

Sample Output

		*	

		*	*	

*	*	*	*	*	

		*	*	

		*	



*/


import java.util.*;

public class Pattern17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n/2;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            {
                if(i == n/2 + 1){
                    System.out.print("*\t");    
                }
                else{
                    System.out.print("\t");
                }
                
            }


            for(int j = 1; j <= nst; j++)
            {
                System.out.print("*\t");
            }

            if(i <= n/2)
            {
                nst++;
            } else {
                nst--;
            }
            System.out.println();
        }
        sc.close();
    }

}
