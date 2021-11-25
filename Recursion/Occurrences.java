public class Occurrences 
{
    public static int first = -1, last = -1;

    public static void firstNLastOccurrence(String str, char ele, int index)
    {
        if(index == str.length())
        {
            System.out.println("First Occurrence is at: " + first);
            System.out.println("Last Occurrence is at: " + last);
            return;
        }

        if(ele == str.charAt(index))
        {
            if(first == -1)
            {
                first = index;
            }
            else last = index;
        }

        firstNLastOccurrence(str, ele, index+1);
    }

    public static void main(String[] args)
    {
        String str = "abcdeabgch";
        firstNLastOccurrence(str, 'c', 0);
    }    
}
