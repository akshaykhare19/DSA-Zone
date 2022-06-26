import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctInWindow
{

    //TC - O(n*k*k)
    //SC - O(1)
    public static ArrayList<Integer> countDistinctBrute(int a[], int k)
    {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < a.length-k+1; i++)
        {
            int cnt = 0;
            for(int j = i; j < i+k; j++)
            {
                int l;
                for(l = i; l < j; l++)
                {
                    if(a[l] == a[j]) break;
                }
                if(l==j) cnt++;
            }
            al.add(cnt);
        }

        return al;
    }
    
    //TC - O(n)
    //SC - O(n)
    public static ArrayList<Integer> countDistinct(int a[], int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++)
        {
            //first four elements
            if(map.containsKey(a[i]))
            {
                int freq = map.get(a[i]);
                freq++;
                map.put(a[i], freq);
            } 
            else {
                map.put(a[i], 1);
            }
        }
        al.add(map.size());

        for(int i = k; i < a.length; i++)
        {
            //rest of the elements

            //adding the next element in the map
            if(map.containsKey(a[i]))
            {
                int freq = map.get(a[i]);
                freq++;
                map.put(a[i], freq);
            } 
            else {
                map.put(a[i], 1);
            }

            //removing or decreasing the count of the first element of the previous window
            if(map.get(a[i-k]) > 1)
            {
                int freq = map.get(a[i-k]);
                freq--;
                map.put(a[i-k], freq);
            }
            else{
                map.remove(a[i-k]);
            }

            al.add(map.size());
        }

        return al;
    }

    public static void main(String args[])
    {
        int a[] = {1,2,2,1,3,1,4,2,3};
        int k = 4;
        System.out.println(countDistinctBrute(a, k));
        System.out.println(countDistinct(a, k));
    }
}
