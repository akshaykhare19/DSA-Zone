public class TowerOfHanoi
{

    public static void towerOfHanoi(int n, String source, String helper, String destination)
    {
        if(n == 1)
        {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n-1, source, destination, helper); //sending n-1 disks from source to helper
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination); //sending n-1 disks from helper to destination
    }

    public static void main(String[] args)
    {
        towerOfHanoi(3, "Source", "Helper", "Destination");
    }
}