import java.util.*;
public class UnionOfArrays
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3};
        Set<Integer> set = new HashSet<>();
        for(int i : a) set.add(i);
        for(int i : b) set.add(i);
        System.out.println("The size of the union of the two arrays containing unique elements is " + set.size());
    }    
}
