package bitManipulation;

/*
 * Write a program to print Binary representation of a given number N.

Example 1:

Input:
N = 2
Output:
000000000000000000000000000010
Explanation:
The binary representation of 2 is '10'
but we need to print in 30 bits so append
remaining 0's in the left.

Example 2:

Input:
N = 5
Output:
000000000000000000000000000101
Explanation:
The binary representation of 5 is '101'.

Your Task:  
You don't need to read input or print anything. Your task is to complete the 
function getBinaryRep() which takes an Integer N as input parameter and returns 
a string of size 30 which is the binary representation of N.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^9
 */

public class BinaryRepresentation {
	
	static String getBinaryRep(int N){
        // code here
        String res = "";
        for(int i  = 1 << 29; i > 0; i = i >> 1)
        {
            if((N & i) != 0)
            {
                res += "1";
            } else res += "0";
        }
        return res;
    }

}
