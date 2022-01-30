import java.util.Scanner;

/*

Digits Of A Number

easy

1. You've to display the digits of a number.

2. Take as input "n", the number for which digits have to be displayed.

3. Print the digits of the number line-wise.
Constraints

1 <= n < 10^9
Format
Input

"n" where n is any integer.
Output

d1

d2

d3

... digits of the number
Example

Sample Input

65784383
Sample Output

6
5
7
8
4
3
8
3

*/



public class DigitsOfANumber
{
    public static void digits(long n){
        if(n == 0) return;

        int digit = (int)n % 10;
        digits(n/10);
        System.out.println(digit);

    }

public static void main(String[] args) {
  // write your code here  

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    digits(n);
    sc.close();

 }
}
