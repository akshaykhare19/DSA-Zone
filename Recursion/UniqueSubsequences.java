import java.util.HashSet;

public class UniqueSubsequences 
{
    public static void printUniqueSubsequences(String str, int index, String newStr, HashSet<String> set)
    {
        if(index == str.length())
        {
            if(set.contains(newStr)) return;
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currentChar = str.charAt(index);

        //to include itself
        printUniqueSubsequences(str, index+1, newStr + currentChar, set);

        //to not include itself
        printUniqueSubsequences(str, index+1, newStr, set);
    }   
    
    public static void main(String[] args)
    {
        //TIME COMPLEXITY: O(2^n)
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequences(str, 0, "", set);
    }    
}
