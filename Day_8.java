//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> newMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            newMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (newMap.containsKey(s))
                System.out.println(s+"="+newMap.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
