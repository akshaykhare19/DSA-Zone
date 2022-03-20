import java.util.Scanner;

/*

First Index And Last Index

easy

1. You are given a number n, representing the size of array a.

2. You are given n numbers, representing elements of array a.



Asssumption - Array is sorted. Array may have duplicate values.
Constraints

1 <= n <= 1000

1 <= n1, n2, .. n elements <= 100

1 <= d <= 100
Format
Input

A number n

n1

n2

.. n number of elements

A number d
Output

A number representing first index

A number representing last index
Example

Sample Input

15

1

5

10

15

22

33

33

33

33

33

40

42

55

66

77

33
Sample Output

5

9

*/


public class FirstnLastIndex
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
    
        int d = sc.nextInt();
        int first = firstIndex(a, d);
        int last = lastIndex(a, d);
    
        System.out.println(first + "\n" + last);
        sc.close();
     }
    
     public static int firstIndex(int a[], int d){
         int l = 0, r = a.length-1;
         int first = -1;
         
        while(l <= r){
            int mid = (l+r)/2;
    
            if(a[mid] == d){
                first = mid;
                r = mid-1;
            }
    
            else if(a[mid] < d){
                l = mid + 1;
            }
    
            else if(a[mid] > d){
                r = mid - 1;
            }
        }
    
         return first;
     }
    
     public static int lastIndex(int[] a, int d){
         int l = 0, r = a.length-1;
         int last = -1;
         while(l <= r){
             
             int mid = (l+r)/2;
    
             if(a[mid] == d){
                 last = mid;
                 l = mid+1;
             }
    
             else if(a[mid] < d){
                 l = mid+1;
             }
    
             else if(a[mid] > d){
                 r = mid-1;
             }
         }
         return last;
     }
}
