import java.util.*;
public class SubsequenceWithKSum
{
    // Any one subsequence with sum k
    private static boolean f(int idx, List<Integer> ds, int sum, int k, int a[])
    {

        if(idx==a.length){
            if(sum==k) {
                System.out.println(ds);
                return true;
            }
            return false;
        }

        ds.add(a[idx]);
        sum+=a[idx];
        if(f(idx+1, ds, sum, k, a)) return true;
        // if(isFound) return;
        ds.remove(ds.size()-1);
        sum-=a[idx];
        if(f(idx+1, ds, sum, k, a)) return true;
        return false;
    }

    public static void main(String args[])
    {
        List<Integer> ans = new ArrayList<>();
        int a[] = {1,2,1,4,3};
        f(0, ans, 0, 5, a);
    }
}