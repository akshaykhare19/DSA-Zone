import java.util.*;

public class Subsequence2
{
    private static void subsequence(int a[], int i, List<Integer> list, List<List<Integer>> res)
    {
        
        if(i==a.length)
        {
            // List<Integer> base = new ArrayList<>();   
            // base.add(-1);
            // list.add(base);
            if(list.size()>0) res.add(list);
            return; 
        }

        subsequence(a, i+1, list, res);
        list.add(a[i]);
        subsequence(a, i+1, list, res);
        list.remove(list.size()-1);

    }

    public static void main(String args[])
    {
        int a[] = {3,1,2};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        subsequence(a, 0, res, list);
        System.out.println(list);
    }    
}
