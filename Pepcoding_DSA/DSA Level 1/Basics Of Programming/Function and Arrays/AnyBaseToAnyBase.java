/*

Any Base To Any Base

easy

1. You are given a number n.

2. You are given a base b1. n is a number on base b.

3. You are given another base b2.

4. You are required to convert the number n of base b1 to a number in base b2.
Constraints

0 <= n <= 512

2 <= b1 <= 10

2 <= b2 <= 10
Format
Input

A number n

A base b1

A base b2
Output

A number of base b2 equal in value to n of base b1.
Example

Sample Input

111001

2

3
Sample Output

2010

*/


import java.util.*;

public class AnyBaseToAnyBase
{
    public static void main(String[] args) 
    {   
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase= scn.nextInt();

        int decimal = anyBaseToDecimal(n, sourceBase);
        int ans = decimalToAnyBase(decimal, destBase);
        System.out.println(ans);
        scn.close();
    }

    public static int anyBaseToDecimal(int n, int b)
    {
        int ans = 0;
        int power = 1;
        while(n > 0){
            int rem = n%10;
            ans = ans + rem * power;
            power*=b;
            n/=10;
        }
        return ans;
    }

    public static int decimalToAnyBase(int n, int b)
    {
        int ans = 0;
        int power = 1;
        while(n > 0){
            int rem = n%b;
            ans = ans + rem * power;
            power*=10;
            n/=b;
        }
        return ans;
    }
}