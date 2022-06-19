import java.util.Scanner;

/*

Ring Rotate

easy

You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.

You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.



shell-rotate



You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.

You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
Constraints

1 <= n <= 10^2

1 <= m <= 10^2

-10^9 <= e11, e12, .. n * m elements <= 10^9

0 < s <= min(n, m) / 2

-10^9 <= r <= 10^9
Format
Input

A number n

A number m

e11

e12..

e21

e22..

.. n * m number of elements of array a

A number s

A number r
Output

output is handled by display function
Example

Sample Input

5

7

11

12

13

14

15

16

17

21

22

23

24

25

26

27

31

32

33

34

35

36

37

41

42

43

44

45

46

47

51

52

53

54

55

56

57

2

3
Sample Output

11 12 13 14 15 16 17

21 25 26 36 46 45 27

31 24 33 34 35 44 37

41 23 22 32 42 43 47

51 52 53 54 55 56 57

*/

public class RingRotate
{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ring[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ring[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int r = sc.nextInt();

        int shell1D[] = fill1DFrom2D(ring, s);
        rotate1D(shell1D, r);
        fill2DFrom1D(ring, shell1D, s);
        display(ring);
        sc.close();

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] fill1DFrom2D(int a[][], int sno){
        int n = a.length, m = a[0].length;
        int size = 2 * (m + n - (4*sno) + 2);

        int la[] = new int[size];

        int rmin = sno-1, rmax = n-sno, cmin = sno-1, cmax = m-sno;
        int index = 0;

        for(int i = rmin; i <= rmax; i++){
            la[index] = a[i][cmin];
            index++;
        }
        cmin++;

        for(int i = cmin; i <= cmax; i++){
            la[index] = a[rmax][i];
            index++;
        }
        rmax--;

        for(int i = rmax; i >= rmin; i--){
            la[index] = a[i][cmax];
            index++;
        }
        cmax--;

        for(int i = cmax; i >= cmin; i--){
            la[index] = a[rmin][i];
            index++;
        }

        return la;
    }

    public static void rotate1D(int a[], int rno){
        rno %= a.length;
        if(rno < 0){
            rno += a.length;
        }

        reverse(a, 0, a.length-1);
        reverse(a, 0, rno-1);
        reverse(a, rno, a.length-1);

    }

    public static void reverse(int a[], int left, int right){
        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }

    }

    public static void fill2DFrom1D(int a[][], int b[], int sno){
        int n = a.length, m = a[0].length;

        int rmin = sno-1, rmax = n-sno, cmin = sno-1, cmax = m-sno;
        int index = 0;

        for(int i = rmin; i <= rmax; i++){
            a[i][cmin] = b[index];
            index++;
        }
        cmin++;

        for(int i = cmin; i <= cmax; i++){
            a[rmax][i] = b[index];
            index++;
        }
        rmax--;

        for(int i = rmax; i >= rmin; i--){
            a[i][cmax] = b[index];
            index++;
        }
        cmax--;

        for(int i = cmax; i >= cmin; i--){
            a[rmin][i] = b[index];
            index++;
        }

    }
}
