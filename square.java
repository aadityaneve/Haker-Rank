import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        
        //System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n>0 && n<100){
            System.out.println("Square of "+n+" is : "+(n*n));
        }else{
            System.out.println("Enter a number less than 100.");
        }
    }
}