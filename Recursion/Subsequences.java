public class Subsequences 
{
    public static void printSubsequences(String str, int index, String newStr)
    {
        if(index == str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);

        //to include itself
        printSubsequences(str, index+1, newStr + currentChar);

        //to not include itself
        printSubsequences(str, index+1, newStr);
    }   
    
    public static void main(String[] args)
    {
        //TIME COMPLEXITY: O(2^n)
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}
