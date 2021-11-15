public class PrintFiveToOne 
{
    public static void main(String args[])
    {
        System.out.println("Decreasing Order");
        recursivePrintDecreasingOrder(5);

        System.out.println("Increasing Order");
        recursivePrintIncreasingOrder(5);
    }

    static void recursivePrintDecreasingOrder(int n)
    {
        if(n == 0) return;                          //base case
        System.out.println(n);                      //print
        recursivePrintDecreasingOrder(n-1);         //recursion
    }

    static void recursivePrintIncreasingOrder(int m)
    {
        if(m == 0) return;
        recursivePrintIncreasingOrder(m-1);
        System.out.println(m);
    }

}