//Find the majority element in an array. 
//(Majority element is the element whose frequency is greater than n/2 where
//n is the size of the array)

public class MajorityElementBrute 
{
    static int majorityElementFinder(int a[])
    {
        int majEle = 0, maxCount = 0, ansIndex = 0;
        for(int i = 0; i < a.length; i++)
        {
            majEle = a[i];
            int count = 0;
            for(int j = 0; j < a.length; j++)
            {
                if(a[j] == majEle) count++;
            }
            if(maxCount < count)
            {
                maxCount = count;
                ansIndex = i;
            }
            
        }
        if(maxCount > a.length/2) return a[ansIndex];
        return 0;
    }

    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 2, 1, 3, 1};
        
        System.out.println(majorityElementFinder(a));
    }
}
