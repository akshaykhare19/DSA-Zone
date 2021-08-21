/*
Someone is asked to perform the following operations on a randomly chosen number between 1 and 10.

 

Step 1: Double the chosen number.

 

Step 2: Add a number K(even number given as input) to the number obtained after Step1

Step 3: Divide the obtained number in Step 2 by 2.

Step 4: Now subtract the obtained number in Step 3 with the original chosen number N

Your task is to find the answer obtained at the end of Step 4 
,i.e,at the end of all the mentioned operations performed on the number chosen.

 

Example 1:

Input:
K = 10
Output:
5
Explanation:
Suppose chosen number is 3, then after
Step 1: number=6
Step 2: number=6+10=16
Step 3: number=16/2=8
Step 4: 8-3=5(required answer).
No matter what number Rohan chooses
the answer always comes to be 5.

Example 2:

Input:
K = 2
Output:
1
Explanation:
Suppose chosen number is 8, then after
Step 1: number=16
Step 2: number=16+2=18
Step 3: number=18/2=9
Step 4: 9-8=1(required answer).
No matter what number Rohan chooses
the answer always comes to be 1.

 

Your Task:
You don't need to read input or print anything. Your task is to complete 
the function mindGame() which takes an Integer K as input and returns the answer.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
2 <= K <= 108
*/


//We could directly return K/2 also.
public class MindGame {
    static int mindGame(int K) {
        // code here
        // int n = (int)(Math.random()*(max-min+1)+min);
        int n = (int)((Math.random()*11) + 1);
        
        // Random random = new Random();
        // int n = random.nextInt(11);
        return ((((n*2) + K) / 2) - n);
    }
}
