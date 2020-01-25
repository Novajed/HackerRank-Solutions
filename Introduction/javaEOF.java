//github.com/Novajed

//https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int lnNum = 0;
             
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/");        
        
        while(sc.hasNextLine()) {      
            lnNum++;        
            System.out.println(lnNum + " " + sc.nextLine());                   
        }
        sc.close();
    }
}
