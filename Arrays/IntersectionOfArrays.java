import java.util.*;

public class IntersectionOfArrays
{
    public static void main(String args[])
    {
        int a[] = {1,4,2,5,2};
        int b[] = {2,5,1,4,6,7};
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i : a) set.add(i);

        for(int i : b)
        {
            if(set.contains(i))
            {
                count++;
                set.remove(i);
            }
        }
        System.out.println("The number of common elements in the two arrays are " + count);
    }    
}
