//github.com/Novajed

//https://www.hackerrank.com/challenges/java-substring

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        //Added close to reinforce habit of closing scanner :P
        in.close();

         
        System.out.print(S.substring(start, end));
    }
}
