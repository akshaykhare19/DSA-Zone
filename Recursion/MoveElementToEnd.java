public class MoveElementToEnd
{
    public static int count = 0;

    public static void moveElement(String str, int index, String newStr, char ele)
    {
        if(index == str.length())
        {
            while(count-- > 0)
            {
                newStr += ele;
            }
            System.out.println("New String is " + newStr);
            return;
        }

        if(str.charAt(index) == ele)
        {
            count++;
        }
        else newStr += str.charAt(index);

        moveElement(str, index+1, newStr, ele);
    }

    public static void main(String[] args)
    {
        String str = "axbcxadg";
        moveElement(str, 0, "", 'a');
    }
}