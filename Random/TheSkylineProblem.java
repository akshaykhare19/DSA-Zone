import java.util.*;
public class TheSkylineProblem
{
    public static void main(String args[])
    {
        int buildings[][] = {{1,1001,1000},
                            {2,1001,999},
                            {3,1001,998}};

        System.out.println(getSkyline(buildings));

    }

    public static List<List<Integer>> getSkyline(int[][] buildings) {
        int coordinates[][] = new int[2*buildings.length][2];
        
        int k = 0;
        for(int building[] : buildings){
            // List<Integer> temp = new ArrayList<>();
            //start
            coordinates[k][0] = building[0];
            coordinates[k][1] = -building[2];

            k++;

            //end
            coordinates[k][0] = building[1];
            coordinates[k][1] = building[2];

            k++;


            // temp.add(building[0]);
            // temp.add(-building[2]);
            // coordinates.add(new ArrayList<>(temp));
            
            // temp = new ArrayList<>();
            
            // //end
            // temp.add(building[1]);
            // temp.add(building[2]);
            // coordinates.add(new ArrayList<>(temp));
        }
        
        Arrays.sort(coordinates, (a,b) -> a[0]!=b[0] ? a[0]-b[0] : a[1]-b[1]);
        System.out.println(coordinates);
        List<List<Integer>> skyline = new ArrayList<>();
        // skyline.add(new ArrayList<>(1,2));
        PriorityQueue<Integer> height = new PriorityQueue<>(Comparator.reverseOrder());
        
        height.offer(0);
        int currHt = 0;
        
        for(int coordinate[] : coordinates){
            
            //start
            if(coordinate[1]<0){
                height.offer(-coordinate[1]);
                
                if(height.peek() > currHt){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(coordinate[0]);
                    temp.add(-coordinate[1]);
                    skyline.add(new ArrayList<>(temp));
                    currHt = height.peek();
                }
            }
            
            //end
            else{
                height.remove(coordinate[1]);
                
                if(height.peek() < currHt){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(coordinate[0]);
                    temp.add(height.peek());
                    skyline.add(new ArrayList<>(temp));
                    currHt = height.peek();
                }
            }
            
        }
        
        return skyline;
        
        
    }

}