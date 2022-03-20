import java.util.Scanner;

/*

Print All Palindromic Substrings

easy

1. You are given a string. 

2. You have to print all palindromic substrings of the given string.
Constraints

1 <= length of string <= 500
Format
Input

A String
Output

All palindromic substrings(one in a line).

First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.
Example

Sample Input

abcc
Sample Output

a

b

c

cc

c

*/

public class PalindromicSubstrings
{
    public static void solution(String str){
		//write your code here
		for(int i = 0; i < str.length(); i++){
			for(int j = i; j < str.length(); j++){
				if(isPalindrome(str.substring(i, j+1))){
					System.out.println(str.substring(i, j+1));
				}
			}
		}
		
	}

	public static boolean isPalindrome(String str){
		int l = 0, r = str.length()-1;
		while(l < r){
			if(str.charAt(l) != str.charAt(r)){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}

}
