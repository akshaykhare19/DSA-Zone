//Find the majority element in an array. (Majority element is the element with the highest frequency)

public class MajorityElement 
{
    static int majorityElementFinder(int a[])
    {
        int majEle = 0;
        for(int i = 0; i < a.length; i++)
        {
            majEle = a[i];
            int count = 0;
            for(int j = 0; j < a.length; j++)
            {
                if(a[j] == majEle) count++;
            }
            System.out.print("Element " + majEle + " occurs " + count + " times.");
        }
        return majEle;
    }

    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 3, 1, 1, 1};
        
        System.out.println(majorityElementFinder(a));
    }
}
