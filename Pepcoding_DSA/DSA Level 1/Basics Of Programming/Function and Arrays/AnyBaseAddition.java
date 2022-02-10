import java.util.*;

public class AnyBaseAddition
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    private static int getSum(int b, int n1, int n2)
    {
        int ans = 0, placeVal, carry = 0, power = 1;
        while(n1 > 0 || n2 > 0){
            int d1 = n1%10;
            int d2 = n2%10;
            placeVal = (d1 + d2 + carry) % b;
            carry = (d1 + d2 + carry) / b;
            ans += (placeVal * power);
            power*=10;
            n1/=10;
            n2/=10;
        }
        return ans;
    }
    
}
