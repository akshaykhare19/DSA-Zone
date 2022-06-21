//Minimize the maximum number of pages read by a student

public class BooksAllocation
{
    public static boolean isFeasible(int a[], int k, int res)
    {
        int student = 1, sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(sum+a[i] > res)
            {
                student++;
                sum = a[i];
            }
            else{
                sum+=a[i];
            }
        }
        return student <= k;
    }

    public static int booksAllocation(int a[], int k)
    {
        int max = sumOfArray(a);
        int min = maxInArray(a);
        int res = 0;

        while(max >= min)
        {
            int mid = (max+min)/2;
            if(isFeasible(a, k, mid))
            {
                max = mid-1;
                res = mid;
            }
            else{
                min = mid+1;
            }
        }
        return res;
    }

    public static int maxInArray(int a[])
    {
        int max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int sumOfArray(int a[])
    {
        int sum = a[0];
        for(int i = 1; i < a.length; i++)
        {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String args[])
    {
        int a[] = {10,20,5,5};
        int k = 3;
        System.out.println(booksAllocation(a, k));
    }    
}
