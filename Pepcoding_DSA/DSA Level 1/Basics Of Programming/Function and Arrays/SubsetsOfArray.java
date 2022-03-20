import java.util.Scanner;

/*

Subsets Of Array

easy

1. You are given a number n, representing the count of elements.

2. You are given n numbers.

3. You are required to print all subsets of arr. Each subset should be

on separate line. For more clarity check out sample input and output.
Constraints

1 <= n <= 10

0 <= n1, n2, .. n elements <= 10^3
Format
Input

A number n

n1

n2

.. n number of elements
Output

[Tab separated elements of subset]

..

All subsets
Example

Sample Input

3

10

20

30
Sample Output

-	-	-	

-	-	30	

-	20	-	

-	20	30	

10	-	-	

10	-	30	

10	20	-	

10	20	30

*/

public class SubsetsOfArray
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
    
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    
        subsetsOfArray(a);
        sc.close();
    
     }
    
    
     public static void subsetsOfArray(int a[]){
         int n = a.length;
         int ts = (int)Math.pow(2, n);
         
         for(int i = 0; i < ts; i++){
             int bn = dToB(i);
             int power = (int)Math.pow(10, n-1);
    
             for(int j = 0; j < n; j++){
                 int div = bn/power;
                 if(div == 1){
                     System.out.print(a[j] + "\t");
                 }
                 else{
                     System.out.print("-\t");
                 }
    
                 bn%=power;
                 power/=10;
                 
             }
             System.out.println();
         }
    }
    
     public static int dToB(int n){
         int res = 0, pow = 1;
         while(n > 0){
             int digit = n%2;
             n/=2;
             res += (pow * digit);
             pow*=10;
         }
         return res;
     }
}
