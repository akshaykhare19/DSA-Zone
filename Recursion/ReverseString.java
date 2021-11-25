public class ReverseString 
{

    public static void printReverse(String str, int lastIndex)
    {
        if(lastIndex == 0)
        {
            System.out.println(str.charAt(lastIndex));
            return;
        }

        System.out.print(str.charAt(lastIndex));
        printReverse(str, lastIndex-1);
    }

    public static void main(String[] args)
    {
        //TIME COMPLEXITY: O(n), where n is the lenght of the string
        String str = "akshay";
        printReverse(str, str.length()-1);
    }    
}
