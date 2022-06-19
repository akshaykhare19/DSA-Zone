/*

Balanced Brackets

easy

1. You are given a string exp representing an expression.

2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.



e.g.

[(a + b) + {(c + d) * (e / f)}] -> true

[(a + b) + {(c + d) * (e / f)]} -> false

[(a + b) + {(c + d) * (e / f)} -> false

([(a + b) + {(c + d) * (e / f)}] -> false
Constraints

0 <= str.length <= 100
Format
Input

A string str
Output

true or false
Example

Sample Input

[(a + b) + {(c + d) * (e / f)}]
Sample Output

true

*/

import java.util.*;

public class BalancedBrackets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
        }
    }
}