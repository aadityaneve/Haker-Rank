import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        //System.out.println("Enter how many numbers : ");
        int n = sc.nextInt();
    
        String str = sc.nextLine();
        str = sc.nextLine();
        
        int sum=0;
        String[] split = str.split(" ");
        for(int i=0;i<n;i++){
            if(n<10000){
                sum = sum + Integer.parseInt(split[i]);
                if(Integer.parseInt(split[i]) == 42){
                    break;
                }
            }else{
                System.out.println("invalid number");
            }
        }
        System.out.println(sum);
    }
}