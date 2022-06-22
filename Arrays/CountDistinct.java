//Count the distinct elements in an array

import java.util.HashSet;
import java.util.Set;

public class CountDistinct
{
    public static void main(String args[])
    {
        int a[] = {1,2,1,4,6,2,6,7};
        Set<Integer> set = new HashSet<>();
        for(int i : a)
        {
            set.add(i);
        }
        System.out.println("The no. of unique elements is " + set.size());
        System.out.println("The elements are:");
        System.out.println(set);
    }    
}
