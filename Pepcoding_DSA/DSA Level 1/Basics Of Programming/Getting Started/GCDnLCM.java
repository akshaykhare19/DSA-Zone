/*

Gcd And Lcm

easy

1. You are required to print the Greatest Common Divisor (GCD) of two numbers. 

2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers. 

3. Take input "num1" and "num2" as the two numbers. 

4. Print their GCD and LCM.
Constraints

2 <= n <= 10^9
Format
Input

num1

num2

.. the numbers whose GCD and LCM we have to find.
Output

a

b

.. where 'a' and 'b' are the GCD and LCM respectively.
Example

Sample Input

36

24
Sample Output

12

72

*/


import java.util.Scanner;

public class GCDnLCM 
{
    static int gcdOf(int a, int b)
    {
        if(a == b) return a;

        else {
            int smallerNum = Math.min(a, b);
            int gcd = 0;
            for(int i = 1; i <= smallerNum; i++)
            {
                if(a%i == 0 && b%i == 0)
                {
                    gcd = i;
                }
            }
            return gcd;
        }
    }
    
    static int lcmOf(int a, int b)
    {
        if(a == b) return a;

        else {
            int biggerNum = Math.max(a, b);
            int lcm = 0;
            int i = biggerNum;
            while(true)
            {
                if(i%a == 0 && i%b == 0)
                {
                    lcm = i;
                    break;
                }
                i++;
            }
            return lcm;
        }
    }

    
    public static void main(String[] args) 
    {
        // write your code here 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdOf(a, b) + "\n" + lcmOf(a, b));
        sc.close();
    }    
}
