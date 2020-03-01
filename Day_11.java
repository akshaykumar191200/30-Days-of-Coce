import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int hourglass = -64;    // since minimun value can be at any place is -9. hence -9*7=-63+1;
        for(int i = 0; i < 4; i++){
            int temp = 0;
            for(int j = 0; j < 4; j++){
                temp = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                temp += arr[i+1][j+1];
                temp += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                hourglass = hourglass<=temp ? temp : hourglass;
            }
        }
    
        System.out.println(hourglass);

        scanner.close();
    }
}
