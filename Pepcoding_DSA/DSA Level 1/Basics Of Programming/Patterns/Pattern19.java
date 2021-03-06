/*

Pattern 19

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

pat191
Example

Sample Input

5

Sample Output
*       *       *               *
                *               *
*       *       *       *       *
*               *
*               *       *       *

*/



import java.util.*;

public class Pattern19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
     {
         for(int j = 1; j <= n; j++)
         {
             if((i == 1)){
                if((j <= n/2 + 1) || j == n)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
             }

             else if((i < n/2 + 1)){
                 if((j == n/2 + 1) || j == n)
                    System.out.print("*\t");
                 else
                    System.out.print("\t");
             }

             else if(i == n/2 + 1){
                System.out.print("*\t");
             }

             else if(((i > n/2 + 1) && (i < n))){
                if((j == 1) || j == n/2 + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
             }

             else if(i == n){
                if(j >= n/2 + 1 || j == 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
             }

         }
         System.out.println();
     }
        sc.close();
    }
}
