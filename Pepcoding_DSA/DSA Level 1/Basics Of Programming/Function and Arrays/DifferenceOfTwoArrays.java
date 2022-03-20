import java.util.Scanner;

/*

Difference Of Two Arrays

easy

1. You are given a number n1, representing the size of array a1.

2. You are given n1 numbers, representing elements of array a1.

3. You are given a number n2, representing the size of array a2.

4. You are given n2 numbers, representing elements of array a2.

5. The two arrays represent digits of two numbers.

6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1



Assumption - number represented by a2 is greater.
Constraints

1 <= n1, n2 <= 100

0 <= a1[i], a2[i] < 10

number reresented by a1 is smaller than number represented by a2
Format
Input

A number n1

n1 number of elements line separated

A number n2

n2 number of elements line separated
Output

A number representing difference of two numbers (a2 - a1), represented by two arrays.
Example

Sample Input

3

2

6

7

4

1

0

0

0
Sample Output

7

3

3

*/

public class DifferenceOfTwoArrays
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
    
        arrayDifference(a1, a2);
        sc.close();
     }
    
     public static void arrayDifference(int[] a, int[] b){
         int borrow = 0;
         int ans[] = new int[b.length];
         int i = a.length-1;
         int j = b.length-1;
         int k = ans.length-1;
         while(k >= 0){
             int diff = b[j] - borrow;
    
             if(i >= 0){
                 diff-=a[i];
             }
    
             if(diff < 0){
                 diff += 10;
                 borrow = 1;
             }
             else{
                 borrow = 0;
             }
            ans[k] = diff;
            i--;
            j--;
            k--;
         }
    
        int m = 0;
        while(ans[m] == 0){
            m++;
        }
        for(; m < ans.length; m++){
            System.out.println(ans[m]);
        }
     }
    
}
