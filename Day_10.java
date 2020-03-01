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
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int number = n;
        String binaryNumber = "";
        
        while(number > 0){
            int remainder = number % 2;
            number /= 2;
            binaryNumber = String.valueOf(remainder) + binaryNumber;
        }
        
        int count = 0;
        int temp = 0;
        for (int i = 0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1')
                temp++;
            else{
                count = count < temp ? temp : count;
                temp = 0;
            }
        }
        count = count < temp ? temp : count;
        System.out.println(count);

        scanner.close();
    }
}
