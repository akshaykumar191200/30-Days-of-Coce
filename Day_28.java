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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result[] = new String[N];
        int len = 0;

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if (emailID.endsWith("@gmail.com"))
                result[len++] = firstName;
        }

        Arrays.sort(result,0,len);
        for (int i = 0; i < len; i++)
            System.out.println(result[i]);

        scanner.close();
    }
}
