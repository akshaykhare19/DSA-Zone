/*

Any Base Multiplication

easy

1. You are given a base b.

2. You are given two numbers n1 and n2 of base b.

3. You are required to multiply n1 and n2 and print the value.
Constraints

2 <= b <= 10

0 <= n1 <= 10000

0 <= n2 <= 10000
Format
Input

A base b

A number n1

A number n2
Output

A number of base b equal in value to n2 * n1.
Example

Sample Input

5

1220

31
Sample Output

43320


*/
import java.util.Scanner;

public class AnyBaseMultiplication
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
     }

    public static int getProduct(int b, int n1, int n2) {
        int finalResult = 0, factor = 1;
        while(n2 > 0){
            int carry = 0, ans = 0, power = 1, placeVal = 0;
            int temp = n1;
            int d2 = n2%10;
            n2/=10;
            while(temp > 0 || carry != 0){
                int d1 = temp%10;
                int val = carry + (d1 * d2);
                placeVal = val % b;
                carry = val / b;
                ans += (placeVal*power);
                power*=10;
                temp/=10;
            }
            int nextLineResult = ans*factor;
            finalResult = getAddition(b, finalResult, nextLineResult);
            factor*=10;
        }
        return finalResult;
    }

    public static int getAddition(int b, int n1, int n2){
        int ans = 0, carry = 0, power = 1, placeVal;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1/=10;
            n2/=10;
            int sum = carry + d1 + d2;
            placeVal = sum % b;
            carry = sum / b;
            ans += (placeVal*power);
            power*=10;
        }
        return ans;
    }
    
}
