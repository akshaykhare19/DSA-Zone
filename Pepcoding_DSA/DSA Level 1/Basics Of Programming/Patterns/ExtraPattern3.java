/*

5               4       3       2
5               4
5       4       3       2       1
                1               2
1       2       3               4

*/


import java.util.Scanner;

public class ExtraPattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            int count;
            if(i <= n/2 + 1)
            {
                count = 5;
            }
            else{
                count = 1;
            }
            for(int j = 1; j <= n; j++)
            {
                if(i == 1)
                {
                    if(j == 1 || j >= n/2 + 1)
                    {
                        System.out.print(count-- + "\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }

                else if(i <= n/2)
                {
                    if(j == n/2 + 1 || j == 1)
                    {
                        System.out.print(count-- + "\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }

                else if(i == n/2 + 1)
                {
                    System.out.print(count-- + "\t");
                }

                else if(i > n/2 + 1 && i != n)
                {
                    if(j == n/2 + 1 || j == n)
                    {
                        System.out.print(count++ + "\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }

                else if(i == n)
                {
                    if(j == n || j <= n/2 + 1)
                    {
                        System.out.print(count++ + "\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
        
    }
}