import java.util.*;
public class SubsequenceWithKSum
{
    private static void f(int idx, List<Integer> ds, int sum, int k, int a[])
    {
        
        if(idx==a.length){
            if(sum==k) System.out.println(ds);
            return;
        }

        ds.add(a[idx]);
        sum+=a[idx];
        f(idx+1, ds, sum, k, a);
        ds.remove(ds.size()-1);
        sum-=a[idx];
        f(idx+1, ds, sum, k, a);
    }

    public static void main(String args[])
    {
        List<Integer> ans = new ArrayList<>();
        int a[] = {1,2,1};
        f(0, ans, 0, 2, a);
    }
}