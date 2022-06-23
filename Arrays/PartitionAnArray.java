public class PartitionAnArray
{
    public static void display(int a[])
    {
        for(int i : a)
        {
            System.out.print(i + " ");
        }
    }

    public static void partition(int a[], int p)
    {
        //Region i to end -> unknown 
        //Region j to i-1 -> greater than pivot
        //Region 0 to j-1 -> less than or equal to pivot
        int i = 0, j = 0;
        while(i < a.length)
        {
            if(a[i] > p) i++;

            else{
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }
        }

    }

    public static void main(String args[])
    {
        int a[] = {7,9,4,8,3,6,2,1};
        int pivot = 5;
        display(a);
        partition(a, pivot);
        System.out.println();
        display(a);
    }    
}
