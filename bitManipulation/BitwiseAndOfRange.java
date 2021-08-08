package bitManipulation;

/*
 * Given two integers left and right that represent the range [left, right], 
 * return the bitwise AND of all numbers in this range, inclusive.

 

Example 1:

Input: left = 5, right = 7
Output: 4

Example 2:

Input: left = 0, right = 0
Output: 0

Example 3:

Input: left = 1, right = 2147483647
Output: 0

 

Constraints:

    0 <= left <= right <= 231 - 1


 */

public class BitwiseAndOfRange {

public int rangeBitwiseAnd(int left, int right) {
        
        int result = 0;
        
        //If both or any one no. of the end points of the range is zero, then the result is zero 
        if(left == 0 || right == 0) 
            return result;
        
        while(left > 0 && right > 0){
        	
        	//finding positions of MSB for the numbers
            int msbPosLeft = msbPosition(left);
            int msbPosRight = msbPosition(right);
            
            //if the positions are different then result is zero
            if(msbPosLeft != msbPosRight) break;
            
            //position of MSB in both numbers are same hence, add 2^msbPosLeft to the result
            int msbVal = 1 << msbPosLeft;
            result += msbVal;
            
            //and hence, subtract 2^msbPosLeft from left and right end points.
            left -= msbVal;
            right -= msbVal;
        }
        return result;
        
    }
    
	//function to find the most significant set bit of a number
    static int msbPosition(int n){
        int msbPos = -1;
        while(n > 0){
            n = n >> 1;
            msbPos++;
        }
        return msbPos;
    }
}

