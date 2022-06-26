//Find the subarray having the sum equal to the given sum

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum
{
    //TC - O(n^2)
    //SC - O(1)
    public static ArrayList<Integer> subarrayBrute(int a[], int sum)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < a.length; i++)
        {
            int currSum = 0;
            for(int j = i; j < a.length; j++)
            {
                currSum += a[j];
                if(currSum == sum)
                {
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        return ans;
    }

    //TC - O(n)
    //SC - O(n)
    public static ArrayList<Integer> subarray(int a[], int sum)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int curr = 0;
        for(int i = 0; i < a.length; i++)
        {
            curr += a[i];
            //to check if the given sum subarray starts from the index zero
            if(curr == sum)
            {
                ans.add(0);
                ans.add(i);
            }

            if(map.containsKey(curr-sum))
            {
                ans.add(map.get(curr-sum)+1);
                ans.add(i);
                return ans;
            }
            
            map.put(curr, i);
        }

        return ans;
    }

    public static void main(String args[])
    {
        int a[] = {10,-13,29, 15,-18,-2,4,9,11};
        int sum = 22;
        System.out.println(subarrayBrute(a, sum)); 
        System.out.println(subarray(a, sum));
    } 
}
