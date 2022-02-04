/*
Pattern 15

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

pat151
Example

Sample Input

5

Sample Output

		1	

	2	3	2	

3	4	5	4	3	

	2	3	2	

		1	



*/


import java.util.*;

public class Pattern15
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n/2;

        for(int i = 1; i <= n; i++){
            int counter;
            if(i <= n/2 + 1){
                counter = i;
            }
            else{
                counter = n-i+1;
            }
            
            //nsp
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }

            //nst
            for(int j = 1; j <= nst; j++){
                System.out.print(counter + "\t");
                if(j <= nst/2){
                    counter++;
                }
                else{
                    counter--;
                }
                
            }

            if(i <= n/2){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }

            System.out.println();

        }
        scn.close();
    }
}