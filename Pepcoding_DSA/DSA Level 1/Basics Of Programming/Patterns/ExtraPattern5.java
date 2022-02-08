/*

A1
B2      C3
D4      E5      F6
G7      H8      I9      J10        
K11     L12     M13     N14     O15

*/

import java.util.Scanner;

public class ExtraPattern5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char letter = 'A';
        int num = 1;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(letter++ + "" + num++ + "\t");
            }
            System.out.println();
        }
        sc.close();
    }    
}
