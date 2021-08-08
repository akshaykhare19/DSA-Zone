package bitManipulation;

/*
 * Mrs. S is very intelligent and very curious to learn new things. 
 * She was learning few Bit-algorithms but stuck somewhere and wants your help. 
 * The task is to count the set-bits and non set-bits of an integer N. Help her doing the same.

Input:
First line consists of T testcases. Only line of every testcase consists of an integer N.

Output:
For each testcase in new line, print the count of set-bits and non set-bits separated by space.

Constraints:
1 <= T <= 100
1 <= N <=1018

Example:
Input:
2
8
7

Output:
1 3
3 0

Explanation:
Testcase 1: Binary representation of the given number 8 is: 1 0 0 0. 
In this representation number of set-bits and non set-bits is 1 and 3.
 */

public class MrsS_Java {
	
	public void count(long n){
        // your code here.
        
        // int totalBits = (int)((Math.log((int)n) / Math.log(2)) + 1);
        int counter0 = 0;
        for(long i = 1; i <= n; i = i << 1)
        {
            if((i & n) == 0)
            {
                counter0++;
            }
        }
        
        int counter1 = 0;
        while(n != 0)
        {
            n = n & (n-1);
            counter1++;
        }
        System.out.println(counter1 + " " + counter0);
        
    }

}
