package bitManipulation;

/*
 * A number N is given. Divide it in half by using the binary shift operator.
Use the floor value if the result is in decimal. If the number is 1, leave it as it is.


Example 1:

Input: N = 1
Output: 1


Example 2:

Input: N = 37
Output: 18
Explanation: 37/2 = 18.5 which is in 
decimal form and whose floor value is 18.


Your Task:
You do not need to read input or print anything. Your task is to complete the function 
half(), which takes the number N as input parameter and returns the desired output.


Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 109
 */

public class BinaryShiftToDivide {
	
	 static int half(int N){
	        // code here
	        
	        if(N != 1)
	        {
	            return N >> 1;
	        }
	        
	        return 1;
	        
	    }

}
