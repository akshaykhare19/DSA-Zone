/*

1. You've to print first n fibonacci numbers.

2. Take as input "n", the count of fibonacci numbers to print.

3. Print first n fibonacci numbers.
Constraints

1 <= n < 40
Format
Input

n
Output

0

1

1

2

3

5

8

.. first n fibonaccis
Example

Sample Input

10
Sample Output

0
1
1
2
3
5
8
13
21
34

*/

import java.util.*;

public class Fibonacci
{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
  
        int a = 0, b = 1, c;
  
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;  
        }
        sc.close();
  
     }
}
