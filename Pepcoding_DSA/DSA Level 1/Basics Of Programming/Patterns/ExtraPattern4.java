/*

A       B       C               D       E       F
1       2                               2       1
G                                               H
1       2                               2       1
I       J       K               L       M       N

*/

import java.util.Scanner;

public class ExtraPattern4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = n/2+1;
        int nsp = 1;
        char letter = 'A';

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= nst; j++)
            {
                if(i%2 == 0){
                    System.out.print(j + "\t");    
                }
                else{
                    System.out.print(letter++ + "\t");
                }
                
            }

            for(int j = 1; j <= nsp; j++)
            {
                System.out.print("\t");
            }

            for(int j = nst; j > 0; j--)
            {
                if(i%2 == 0){
                    System.out.print(j + "\t");    
                }
                else{
                    System.out.print(letter++ + "\t");
                }
            }

            if(i <= n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }

            System.out.println();
        }
        sc.close();
    }    
}
