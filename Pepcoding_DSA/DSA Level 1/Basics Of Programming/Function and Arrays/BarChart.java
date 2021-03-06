import java.util.Scanner;

/*

Bar Chart

easy

1. You are given a number n, representing the size of array a.

2. You are given n numbers, representing elements of array a.

3. You are required to print a bar chart representing value of arr a.
Constraints

1 <= n <= 30

0 <= n1, n2, .. n elements <= 10
Format
Input

A number n

n1

n2

.. n number of elements
Output

A bar chart of asteriks representing value of array a
Example

Sample Input

5

3

1

0

7

5
Sample Output

*		

			*		

			*	*	

			*	*	

*			*	*	

*			*	*	

*	*		*	*

*/

public class BarChart
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
    
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    
        barChart(a);
        sc.close();
        
     }
    
     public static int maxOfArray(int[] a){
         int max = a[0];
         for(int i = 0; i < a.length; i++){
             if(a[i] > max){
                 max = a[i];
             }
         }
         return max;
     }
    
     public static void barChart(int[] a){
         //for number of rows
         int max = maxOfArray(a);
         for(int i = max; i >= 1; i--){
             for(int j = 0; j < a.length; j++){
                 if(i > a[j]) System.out.print("\t");
                 else System.out.print("*\t");
             }
             System.out.println();
         }
     }
}
