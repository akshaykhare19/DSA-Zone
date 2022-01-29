/*

Count Digits In A Number

easy

1. You've to count the number of digits in a number.

2. Take as input "n", the number for which the digits has to be counted.

3. Print the digits in that number.
Constraints

1 <= n < 10^9
Format
Input

"n" where n is any integer.
Output

"d" where d is the number of digits in the number "n"
Example

Sample Input

65784383
Sample Output

8

*/

import java.util.*;

public class CountDigits
{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int count = 0;
        while(n > 0){
            n/=10;
            count++;
        }
        System.out.println(count);
        sc.close();
      }
}
