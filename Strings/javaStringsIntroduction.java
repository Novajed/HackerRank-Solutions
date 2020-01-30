//github.com/Novajed

//https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //Compute total length of both strings 
        int total_length = A.length() + B.length();
        
        //Print computed value 
        System.out.println(total_length);
        
        //Print yes if Str A lexicographically greater than Str B, otherwise print 'No'
        if (A.compareTo(B) > 0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Capitalize first letter of strings and print 
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1)); 
    }
}
