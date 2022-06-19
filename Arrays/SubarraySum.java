public class SubarraySum
{

    public static int bruteLargestSubarraySum(int a[])
    {
        int n = a.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            for(int j = i; j < n; j++)
            {
                sum += a[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int kadaneAlgorithm(int a[])
    {
        int maxSum = 0;
        int currSum = 0;
        int startIdx = 0, endIdx = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(currSum == 0) startIdx = i;
            currSum += a[i];
            if(maxSum < currSum){
                maxSum = currSum;
                endIdx = i;
            }
            if(currSum < 0) currSum = 0;
            
        }
        System.out.println("Start Index = " + startIdx + "\nEnd Index = " + endIdx);
        return maxSum;
    }

    public static void main(String args[])
    {
        int a[] = {1, 1, 2, 3, -4, 8, -1};
        System.out.println(bruteLargestSubarraySum(a));
        System.out.println("Kadane's Algorithm");
        System.out.println(kadaneAlgorithm(a));
    }
}