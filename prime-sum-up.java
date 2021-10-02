import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int number, count, sum=0;
        //System.out.println("Enter a number : ");
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        number = sc.nextInt();
        
        for(int i=1;i<=number;i++){
            count=0;
            for (int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0 && i!=1 ){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}