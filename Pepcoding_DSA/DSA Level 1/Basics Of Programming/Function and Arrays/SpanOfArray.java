import java.util.Scanner;

/*

Span Of Array

easy

1. You are given a number n, representing the count of elements.

2. You are given n numbers.

3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Constraints

1 <= n <= 10^4

0 <= n1, n2

 .. n elements <= 10 ^9
Format
Input

A number n

n1

n2

.. n number of elements
Output

A number representing max - min
Example

Sample Input

6

15

30

40

4

11

9
Sample Output

36

*/

public class SpanOfArray
{
    public static void main(String[] args) throws Exception
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
    
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
    
        for(int i = 0; i < n; i++)
        {
            if(a[i] > max) max = a[i];
            if(a[i] < min) min = a[i];
        }
        System.out.println(max - min);

        sc.close();
    }
}
