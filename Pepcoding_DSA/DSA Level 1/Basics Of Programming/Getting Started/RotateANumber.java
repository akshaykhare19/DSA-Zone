/*

Rotate A Number

easy

1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.

2. Take as input n and k.

3. Print the rotated number.

4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given

   n = 12340056

   k = 3

   r = 05612340
Constraints

1 <= n < 10^9

-10^9 < k < 10^9
Format
Input

"n" where n is any integer.

"K" where k is any integer.
Output

"r", the rotated number
Example

Sample Input

562984

2
Sample Output

845629

*/


import java.util.Scanner;

public class RotateANumber
{
    static int length(long number)
    {
        int count = 0;
        while(number > 0)
        {
            number /= 10;
            count++;
        }
        return count;
    }

    static long rotate(long num, int rotationFactor)
    {
        long temp = num;
        rotationFactor %= length(num);
        if(rotationFactor > 0)
        {
            long factor = (long)Math.pow(10, rotationFactor);
            long part = temp % factor;  //part to be moved to the right
            long remainingPart = temp / factor;
            long rotatedNum = part * (long)(Math.pow(10, (length(num) - rotationFactor))) + remainingPart;
            return rotatedNum;
        }

        else if(rotationFactor < 0)
        {
            int positiveRotationFactor = Math.abs(rotationFactor);
            long factor = (long)Math.pow(10, positiveRotationFactor);
            long remainingFactor = (long)Math.pow(10, (length(num) - positiveRotationFactor));
            long remainingPart = temp % remainingFactor;
            long part = temp / remainingFactor; // part to be moved to the left
            long rotatedNum = remainingPart * factor + part;
            return rotatedNum;

        }

        return num;
    }    

   
   public static void main(String[] args) 
   {
        // write your code here  
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        System.out.println(rotate(n, k));
        sc.close();
    }
}