/*
 * Caesar Cipher Encryption is done by replacing each letter with the letter 3 positions to the left.
 * Eg. 'a' is replaced with 'x', 'b' is replaced with 'y'
 * 
 * 'a' -> 97
 * 'z' -> 122
 * 
 * 'A' -> 65
 * 'Z' -> 90
 */

public class CaesarCipher
{
    private static String cipher(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            int newCh = ch+3;
            if(newCh>122) sb.setCharAt(i, (char)(96+(newCh%122)));
            else sb.setCharAt(i, (char)newCh);
        }
        return sb.toString();
    }

    public static void main(String args[])
    {
        System.out.println(cipher("nrfzh"));
    }    
}
