import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int da = sc.nextInt();
        int ma = sc.nextInt();
        int ya = sc.nextInt();
        int de = sc.nextInt();
        int me = sc.nextInt();
        int ye = sc.nextInt();

        int fine = 0;
        if (de < da && ma==me && ya==ye){
            fine += 15 * (da-de);
        }
        else if(me < ma && ye==ya){
            fine += 500 * (ma-me);
        }
        else if(ye < ya){
            fine += 10000;
        }
        System.out.println(fine);
    }
}
