package Games;
import java.io.*; 
import java.util.*;
public class Flames
  { 
    public static void main (String args[])throws IOException 
      { 
    	Scanner br=new Scanner(System.in);
        String s1,s2,s3="",s4=""; 
        int a[],b[],x=0,y=0; 
        int len1,len2; 
        char ch; 
        int i,j; 
        
        System.out.print("Enter first name (String): "); 
        s1=br.nextLine().trim(); 
        String pa=s1.toUpperCase(); 
        System.out.print("Enter Second name (String): "); 
        s2=br.nextLine().trim();         
        String uS2= s2.toUpperCase();  
        
        len1=pa.length(); 
        
        len2=uS2.length(); 
        
        a=new int[len1]; 
        b=new int[len2]; 
        for(i=0;i<len1;i++) 
        { 
            ch=pa.charAt(i); 
            for(j=0;j<len2;j++) 
            { 
                if(ch==uS2.charAt (j)) 
                break; 
            } 
            if(j!=len2) 
            { 
                a[x++]=i; 
                b[y++]=j; 
            } 
        } 
        for(i=0;i<len1;i++) 
        { 
            for(j=0;j<x;j++) 
            { 
                if(i==a[j]) 
                break; 
            } 
            if(j==x) 
            s3=s3+pa.charAt(i); 
        } 
        for(i=0;i<len2;i++) 
        { 
            for(j=0;j<y;j++) 
            { 
                if(i==b[j]) 
                break; 
            } 
            if(j==y) 
            s4=s4+uS2.charAt(i); 
        } 
        String str=s3+s4; 
        int length=str.length();         
        
        if(length>6 && length<12) {
        	length=length-6;
        }
        
        if(length>12 && length<18) {
        	length=length-12;
        }
        System.out.println(); 
        System.out.print("Relation Prediction :"); 

        switch(length) 
        { 
     case 1: 
     System.out.println("Sister/brother"); 
     break; 
     case 2: 
     System.out.println("Enemy"); 
     break; 
     case 3: 
     System.out.println("Friend"); 
     break; 
     case 4: 
     System.out.println("Love"); 
     break; 
     case 5: 
     System.out.println("Affair"); 
     break; 
     case 6: 
     System.out.println("Marriage"); 
     break; 
      
        } 
      }
 }