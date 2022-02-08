/*

Stella is the most beautiful girl in the world of byteland. 
She likes playing with strings but she doesn't like mixed cases 
in strings. She wants the whole world to be either in lowercase 
or uppercase. On her latest birthday, she received so many strings
as gifts. Now she is not liking a few of these strings due to her case
preferences. You being a really good friend of her want to help in modifying
the strings to make them of her choice. What she wants you to do is,
if the first character of a string is in lowercase make the whole string lowercase
otherwise make it uppercase.

*/

public class StringCase
{
    public static void main(String args[])
    {
        String str = "avCdefeAFBEdfdfEfdv";
        String newStr;

        if(Character.isUpperCase(str.charAt(0)))
        {
            newStr = str.toUpperCase();
        }
        else{
            newStr = str.toLowerCase();
        }

        System.out.println(newStr);
    }
}