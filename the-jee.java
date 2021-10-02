import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        
        // int[2] st1;
        // int[2] st2;
        String str1;
        String str2;
        int totalMarks1=0;
        int physicsMark1=0;
        int chemistryMark1=0;
        int mathsMark1=0;
        int totalMarks2=0;
        int physicsMark2=0;
        int chemistryMark2=0;
        int mathsMark2=0;
        
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        
        //System.out.println("Enter student 1 marks : ");
        str1 = sc.nextLine();
        
        String[] split1 = str1.split(" ");
        for(int i=0;i<3;i++){
            physicsMark1 = Integer.parseInt(split1[0]);
            chemistryMark1 = Integer.parseInt(split1[1]);
            mathsMark1 = Integer.parseInt(split1[2]);
        }
        totalMarks1 = physicsMark1+chemistryMark1+mathsMark1;
        
        //System.out.println("Enter student 2 marks : ");
        str2 = sc.nextLine();
        
        String[] split2 = str2.split(" ");
        for(int i=0;i<3;i++){
            physicsMark2 = Integer.parseInt(split2[0]);
            chemistryMark2 = Integer.parseInt(split2[1]);
            mathsMark2 = Integer.parseInt(split2[2]);
        }
        totalMarks2 = physicsMark2+chemistryMark2+mathsMark2;
        
        //physics chemistry maths

        if(totalMarks1 > totalMarks2){
        	System.out.println("First");
        }else if(totalMarks1 == totalMarks2){
        	if(mathsMark1 > mathsMark2){
        		System.out.println("First");
        	}else if(mathsMark1 == mathsMark2){
        		if(physicsMark1 > physicsMark2){
        			System.out.println("First");
        		}else{
        			System.out.println("Second");
        		}
        	}else{
        		System.out.println("Second");
        	}
        }else{
        	System.out.println("Second");
        }
    }
}