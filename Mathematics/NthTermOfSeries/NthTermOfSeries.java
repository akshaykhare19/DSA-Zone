/*
Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21…

 

Example 1:

Input :
N = 4 
Output:
10
Explanation:
The 4th term of the Series is 10.

Example 2:

Input :
N = 3 
Output:
6
Explanation:
The 3rd term of the Series is 6.

 

Your Task:
You don't need to read input or print anything. Your task is to complete 
the function findNthTerm() which takes an Integer N as input and returns the answer.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 104
*/

public class NthTermOfSeries {
    //1,3,6,10,15,21,28,36,45,55,66,78.....
    static int findNthTerm(int N) {
        // code here
        int res = 0;
        for(int i = 1; i <= N; i++){
            res += i;
        }
        return res;
    }
}
