public class RemoveDuplicates 
{
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int index, String newStr)
    {
        if(index == str.length())
        {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        int pos = currentChar - 'a';

        if(!map[pos])
        {
            newStr += currentChar;
            map[pos] = true;
        }
        removeDuplicates(str, index+1, newStr);
    }   
    
    public static void main(String[] args)
    {
        String str = "abbcdecaf";
        removeDuplicates(str, 0, "");
    }
}
