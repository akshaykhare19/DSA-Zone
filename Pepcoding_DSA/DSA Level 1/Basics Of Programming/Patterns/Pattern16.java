/*

Pattern 16

easy

     1. You are given a number n.

      2. You've to write code to print the pattern given in output format below

                                  

                                 

                                

                               

                               
Constraints

1 <= n <= 10
Format
Input

A number n
Output

pat161
Example

Sample Input

7

Sample Output

1												1	

1	2										2	1	

1	2	3								3	2	1	

1	2	3	4						4	3	2	1	

1	2	3	4	5				5	4	3	2	1	

1	2	3	4	5	6		6	5	4	3	2	1	

1	2	3	4	5	6	7	6	5	4	3	2	1	



*/


import java.util.*;

public class Pattern16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = 2*n - 3;

        for(int i = 1; i <= n; i++)
        {
            //stars
            for(int j = 1; j <= nst; j++)
            {
                System.out.print(j + "\t");
            }

            //spaces
            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("\t");
            }

            //stars
            if(i == n){
                nst--;
            }
            for(int j = nst; j > 0; j--)
                {
                    System.out.print(j + "\t");
                }
            

            nst++;
            nsp-=2;

            System.out.println();
        }
        sc.close();
    }
}
