public class KeypadCombination 
{
    static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; 

    public static void printCombination(String str, int index, String combination)
    {
        if(index == str.length())
        {
            System.out.println(combination);
            return;
        }

        char currentChar = str.charAt(index);
        int pos = currentChar -'0';
        String mapping = keypad[pos];

        for(int i = 0; i < mapping.length(); i++)
        {
            printCombination(str, index+1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        String str = "345827";
        printCombination(str, 0, "");
    }    
}
