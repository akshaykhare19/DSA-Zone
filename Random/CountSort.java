public class CountSort
{
    public static void main(String args[])
    {
        int a[] = {3,4,6,2,1,6,22,20,1,5};

        //Step 1 : Find range of the input numbers and create a frequency array of that size
        int max = maxInArray(a);    //22
        int min = minInArray(a);    //1
        int size = max - min + 1;   //22

        int freq[] = new int[size];
        for(int i = 0; i < a.length; i++)
        {
            //mapping the input numbers with the index of frequency array
            int idx = a[i] - min;
            freq[idx]++;
        }

        //Step 2 : Create prefix sum array of the frequency array
        for(int i = 1; i < size; i++)
        {
            freq[i] = freq[i] + freq[i-1];
        }

        //Step 3 : Create a new array and fill it with the sorted elements
        int ans[] = new int[a.length];

        for(int i = a.length-1; i >= 0; i--)
        {
            int fIdx = a[i] - min;
            int ansPos = freq[fIdx]-1;
            ans[ansPos] = a[i];
            freq[fIdx]--;
        }
        printArray(a);
        printArray(freq);
        printArray(ans);

    }

    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int maxInArray(int arr[])
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    static int minInArray(int arr[])
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            min = Math.min(arr[i], min);
        }
        return min;
    }
}