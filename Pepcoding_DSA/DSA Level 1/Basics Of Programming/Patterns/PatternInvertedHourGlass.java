/*

Pattern Inverted Hour Glass

easy

      1. You are given a number n.
      2. You've to write code to print the pattern given in output format below
Constraints

1 <= n <= 15
 Also, n is odd.
Format
Input

A number n
Example n = 7
Output

*	*	*	*	*	*	*	
	*	*	*	*	*	
		*	*	*	
			*	
		*		*	
	*				*	
*	*	*	*	*	*	*	

*/


import java.util.*;

public class PatternInvertedHourGlass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n;
        int nsp = 0;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("\t");
            }

            for(int j = 1; j <= nst; j++)
            {
                if(i > n/2 + 1 && i < n && j != 1 && j != nst)
                {
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }

            if(i <= n/2){
                nst-=2;
                nsp++;
            } else {
                nst+=2;
                nsp--;
            }
            System.out.println();
        }
        sc.close();
    }
}
