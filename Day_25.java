import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++){
            boolean flag = true;
            int n = sc.nextInt();
            if (n<2)
                flag = false;
            int x = (int)Math.sqrt(n);
            for (int i = 2; i <= x; i++){
                if (n % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        sc.close();
    }
}
