import java.util.Scanner;

/*

Subarray Problem

easy

1. You are given an array of size 'n' and n elements of the same array.

2. You are required to find and print all the subarrays of the given array. 

3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
Constraints

1 <= n <= 10

0 <= n1, n2

 .. n elements <= 10 ^9
Format
Input

A number n

n1

n2

.. n number of elements
Output

[Tab separated elements of subarray]

..

All subarrays
Example

Sample Input

3

10

20

30
Sample Output

10	

10	20	

10	20	30	

20	

20	30	

30	

*/

public class SubArrayProblem
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    
        for(int si = 0; si < n; si++){
            for(int ei = si; ei < n; ei++){
                for(int i = si; i <= ei; i++){
                    System.out.print(a[i] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    
     }
    
}
