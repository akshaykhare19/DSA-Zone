import java.util.*;
public class Kingdom
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(9);
        a.add(9);
        // a.add(1);

        int troops = 0;
        int x = 1;
        int days = 1;
        troops += x;
        while(a.size()>0){
            
            System.out.println("t = " + troops + "\n");
            System.out.println("x = " + x + "\n");
            System.out.println("days = " + days + "\n");
            System.out.println("a.size() = " + a.size() + "\n");
            System.out.println("a = " + a + "\n");
            if(a.contains(troops)){
                a.remove(Integer.valueOf(troops));
                x++;
                troops += x;
                
            }
            days++;
            troops++;
        }
        System.out.println(days);

    }
}