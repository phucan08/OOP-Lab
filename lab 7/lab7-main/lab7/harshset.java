import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
               Set<String> pairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String first = pair_left[i];
            String second = pair_right[i];
            String normalized = first.compareTo(second) <= 0 ? first + " " + second : second + " " + first;

            pairs.add(normalized);
            System.out.println(pairs.size());
        }

    }
}