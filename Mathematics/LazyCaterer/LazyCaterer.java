/*
Given an integer n, denoting the number of cuts that can be 
made on a pancake, find the maximum number of pieces that can be formed by making n cuts.
 

Example 1:

Input: N = 5
Output: 16
Explanation:  16 pieces can be formed by
making 5 cuts.

Example 2:

Input: N = 3
Output: 7
Explanation: 7 pieces can be formed by 
making 3 cuts.

 

Your Task: 
You don't need to read or print anything. Your task is to complete 
the function maximum_Cuts() which takes n as input parameter and returns 
the maximum number of pieces that can be formed by making n cuts.
 

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 10000
*/

public class LazyCaterer {
    public int maximum_Cuts(int n)
    {
        // code here
        //f(n) = n + f(n-1)
        return ((n*(n+1)) / 2) + 1;
    }
}