/*

Pattern M

Easy

you are given a number N and you have to print the generalized given pattern.
for n=5

*				*	
*	*		*	*	
*		*		*	
*				*	
*				*
Constraints

N is an odd number

*/

import java.util.*;

public class PatternM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*\t");
                }

                else if(i <= n/2 + 1 && (i == j || i+j == n+1))
                {
                    System.out.print("*\t");
                }

                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
