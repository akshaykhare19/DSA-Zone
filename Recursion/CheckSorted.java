public class CheckSorted
{
    public static boolean checkIfSorted(int[] a, int index)
    {
        if(index == a.length-1)
        {
            return true;
        }

        if(a[index] < a[index+1])
        {
            return checkIfSorted(a, index+1);
        }
        else return false;
    }

    public static void main(String[] args)
    {
        //is strictly increasing
        int a[] = {1, 2, 4, 7, 7};
        System.out.println(checkIfSorted(a, 0));
    }    
}
