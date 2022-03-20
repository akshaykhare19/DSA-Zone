import java.util.Scanner;

/*


Toggle Case

easy

1. You are given a string that contains only lowercase and uppercase alphabets. 

2. You have to toggle the case of every character of the given string.
Constraints

1 <= length of string <= 1000
Format
Input

A String
Output

A String
Example

Sample Input

pepCODinG
Sample Output

PEPcodINg

*/

public class ToggleCase
{
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
        scn.close();
	}

	public static String toggleCase(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < sb.length(); i++){
			char ch = sb.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				sb.setCharAt(i, (char)((ch - 'a') + 'A'));
			} else {
				sb.setCharAt(i, (char)((ch - 'A') + 'a'));
			}
		}
		return sb.toString();
	}
}
