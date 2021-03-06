/*

Pattern 10

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

pat101
Example

Sample Input

5
Sample Output

		*	

	*		*	

*				*	

	*		*	

		*	

*/

import java.util.*;

public class Pattern10
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
         // write ur code here
         int n = scn.nextInt();
    
         int nsp1 = n/2;
         int nsp2 = -1;
    
         for(int i = 1; i <= n; i++){
    
             //nsp1
             for(int j = 1; j <= nsp1; j++){
                 System.out.print("\t");
             }
    
             System.out.print("*\t");
    
             //nsp2
             for(int j = 1; j <= nsp2; j++){
                 System.out.print("\t");
             }
    
             if(i != 1 && i != n){
                 System.out.print("*\t");
             }
    
             if(i <= n/2){
                 nsp1--;
                 nsp2+=2;
             }
             else{
                 nsp1++;
                 nsp2-=2;
             }
    
             System.out.println();
    
         }
         scn.close();
    
     }
}
