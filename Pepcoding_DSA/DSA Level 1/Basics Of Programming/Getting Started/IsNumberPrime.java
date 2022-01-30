/*

Is A Number Prime

easy

1. You've to check whether a given number is prime or not.

2. Take a number "t" as input representing count of input numbers to be tested.

3. Take a number "n" as input "t" number of times.

4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Constraints

1 <= t <= 10000

2 <= n < 10^9
Format
Input

A number t

A number n

A number n

.. t number of times
Output

prime

not prime

not prime

.. t number of times
Example

Sample Input

5
13
2
3
4
5

Sample Output

prime
prime
prime
not prime
prime

*/



import java.util.Scanner;

public class IsNumberPrime
{
    static boolean isNumPrime(int n)
    {
        boolean isPrime = true;
        
        for(int i = 2; i * i <= n; i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
    }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       while(t-- > 0){
           int n = scn.nextInt(); 
           if(isNumPrime(n)) System.out.println("prime");
           else System.out.println("not prime");
       }
       scn.close();
  
   }
}