/*
 * Soldiers land on rooftops of different buildings, that are connected through ladders.
 * Each soldier can take control of the buildings in a straight line (left-right and forward-backward),
 * w.r.t. the building/position they have been dropped at. The cannot take control of building diagonally.
 * 
 * There are 8 buildings in each row and column. Your goal is to determine and return the total number of
 * buildings that are controlled by these group of soldiers.
 * 
 * A soldier also controls the building on which he/she is currently positioned/dropped.
 * 
 * Input :
 * an integer n representing the number of soldiers
 * 
 * a 2D array of size n*2 representing the position coordinates of the soldiers on the 8*8 grid.
 */

public class MissionAgentY
{
    private static int missionAgentY(int n, int a[][])
    {
        int b[][] = new int[8][8];
        // for(int )
        return 0;
    }

    public static void main(String args[])
    {
        int n = 2;
        int a[][] = {{5,5},{5,3}};
        System.out.println(missionAgentY(n, a));
    }    
}
