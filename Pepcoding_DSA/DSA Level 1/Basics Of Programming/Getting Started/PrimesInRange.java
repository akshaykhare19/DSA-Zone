/*
Print All Primes Till N

easy

1. You've to print all prime numbers between a range. 

2. Take as input "low", the lower limit of range.

3. Take as input "high", the higher limit of range.

4. For the range print all the primes numbers between low and high (both included).
Constraints

2 <= low < high < 10 ^ 6
Format
Input

low 

high
Output

n1

n2

.. all primes between low and high (both included)
Example

Sample Input

6 

24
Sample Output

7
11
13
17
19
23

*/


import java.util.*;

public class PrimesInRange
{
    public static void main(String[] args)
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i <= high; i++){
            boolean isPrime = true;
            for(int j = 2; j*j <= i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) System.out.println(i);
        }
        sc.close();
    } 
}
