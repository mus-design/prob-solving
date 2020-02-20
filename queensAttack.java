import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
      int a[][]=new int[n][n];
      a[r_q-1][c_q-1]=6;
for(int i=0;i<k;i++)
{
  //for(int j=0;j<2;j++)
  {
    a[obstacles[i][0]-1][obstacles[i][1]-1]=5;
  }
  //
}
int count=0;
//for(int i=r_q-2;i>0;i--)

 int j=r_q-2; 
while(j>-1 && a[j][c_q-1]!=5)
{
 count++; 
//System.out.println(j+" "+c_q);
j--;
}//1
j=r_q;
while(j<n && a[j][c_q-1]!=5)
{
 count++; 
//System.out.println(j+" "+c_q);
j++; 
}//2
j=c_q;
while(j<n && a[r_q-1][j]!=5)
{
  count++; 
//System.out.println(j+" "+c_q);
j++;
}//3
j=c_q-2;
while(j>-1 && a[r_q-1][j]!=5)
{
count++; 
//System.out.println(j+" "+c_q);
j--;
 }//4
int i=r_q;
j=c_q;
 while((j<n && i<n) && a[i][j]!=5)
 {
   count++;
   i++;
   j++;
 }//5
 i=r_q-2;
 j=c_q-2;
 while((j>-1 && i>-1) && a[i][j]!=5)
 {
   count++;
   i--;
   j--;
 }//6
 i=r_q-2;
 j=c_q;
 while((j<n && i>-1) && a[i][j]!=5)
 {
   count++;
   i--;
   j++;
 }//7
 j=c_q-2;
 i=r_q;
 while((j>-1 && i<n) && a[i][j]!=5) 
 {
   count++;
  j--;
  i++;
 }//8
  //System.out.println();

return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
