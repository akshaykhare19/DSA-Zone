//Search in a sorted 2D array using Binary Search Algorithm

import java.util.*;

public class SearchIn2DArray
{
    //TC - O(m+n), where a[m][n]
    //SC - O(1)
    public static ArrayList<Integer> search(int a[][], int key)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = a.length-1;
        while(i < a.length && j >= 0){
            if(a[i][j] == key){
                al.add(i);
                al.add(j);
                return al;
            }
            else if(a[i][j] < key){
                i++;
            }
            else{
                j--;
            }
        }
        return al;
    }

    public static void main(String args[])
    {
        int a[][] = {{1,2,3,4},
                      {11,12,13,14},
                      {21,22,23,24},
                      {31,32,32,34}};
        int key = 22;
        ArrayList<Integer> ans = search(a, key);
        System.out.println(ans);
    }    
}
