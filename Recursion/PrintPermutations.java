import java.util.*;
public class PrintPermutations
{
    private static void recurPermute(int a[], List<Integer> res, List<List<Integer>> ans, boolean freq[])
    {
        if(res.size()==a.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        for(int i = 0; i < a.length; i++){
            if(!freq[i]){
                freq[i] = true;
                res.add(a[i]);
                recurPermute(a, res, ans, freq);
                res.remove(res.size()-1);
                freq[i] = false;
            }
        }
    }

    public static List<List<Integer>> permutations(int a[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int len = a.length;
        boolean freq[] = new boolean[len];
        recurPermute(a, res, ans, freq);
        return ans;
    }

    public static void main(String args[])
    {
        int a[] = {1,2,3};
        System.out.println(permutations(a));
    }
}