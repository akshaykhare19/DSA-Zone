import java.util.Scanner;

/*

Sum Of Two Arrays

easy

1. You are given a number n1, representing the size of array a1.

2. You are given n1 numbers, representing elements of array a1.

3. You are given a number n2, representing the size of array a2.

4. You are given n2 numbers, representing elements of array a2.

5. The two arrays represent digits of two numbers.

6. You are required to add the numbers represented by two arrays and print the

arrays.
Constraints

1 <= n1, n2 <= 100

0 <= a1[i], a2[i] < 10
Format
Input

A number n1

n1 number of elements line separated

A number n2

n2 number of elements line separated
Output

A number representing sum of two numbers, represented by two arrays.
Example

Sample Input

5

3

1

0

7

5

6

1

1

1

1

1

1
Sample Output

1

4

2

1

8

6

*/

public class SumOfTwoArrays
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
    
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i = 0; i < n1; i++){
            a1[i] = sc.nextInt();
        }
    
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i = 0; i < n2; i++){
            a2[i] = sc.nextInt();
        }
    
        arraySum(a1, a2);
        sc.close();
     }
    
     public static void arraySum(int[] a, int[] b){
         int i = a.length-1, j = b.length-1;
         int max = 0;
         if(a.length > b.length) max = a.length;
         else max = b.length;
    
         int n = max + 1;
         int k = n-1;
    
         int ans[] = new int[n];
         int carry = 0;
         while(k >= 0){
             int sum = 0;
             if(i >= 0) sum += a[i];
    
             if(j >= 0) sum += b[j];
    
             sum += carry;
    
             ans[k] = sum % 10;
             carry = sum / 10;
             i--;
             j--;
             k--;
         }
        int l;
        if(ans[0] == 0){
            l = 1;
        } else {
            l = 0;
        }
        while(l < n){
            System.out.println(ans[l]);
            l++;
        }
    }
}
