import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.println("enter t");
        long t=sc.nextLong();
        for(int pos=0; pos<t; pos++){
System.out.println("enter n");
            int n=sc.nextInt();
System.out.println("enter m");
            long m=sc.nextLong();
            long arr[]=new long[n];
System.out.println("enter values");
            for(int cou=0; cou<n; cou++){
                arr[cou]=sc.nextLong();
            }

            

            long max=Long.MIN_VALUE;
            long value=0,sum=0,rec,mod;
            long last=arr[n-1];

            


int i=0;
int j=i+1;
while(i<n-1){
                value=arr[i]%m;
System.out.println("single value =" +arr[i]+"%"+m+"="+value);

                if(max<value){
System.out.println("1st compared value =>" +max+"<"+value);
                    max=value;
System.out.println("1st max updated=>"+max+"="+value);
                }

                sum=sum+arr[j];
                rec=sum+arr[i];
System.out.println("rec value =>" +sum+"+"+arr[i]+"="+rec);
                mod=rec%m;
System.out.println("mod value =>" +rec+"%"+m+"="+mod);

                if(max<mod){
System.out.println("2nd compared value =>" +max+"<"+mod);
                    max=mod;
System.out.println("2nd max updated=>"+max+"="+mod);

                }

                if(j==arr.length-1){
                    sum=0;
                    i++;
                    j=i;
                }
j++;
}
                
            



            value=last%m;
System.out.println("single value =" +last+"%"+m+"="+value);
            if(max<value){
System.out.println("last compared value =>" +max+"<"+value);
                max=value;
System.out.println("last max updated=>"+max+"="+value);
            }
            System.out.println(max);
        }
    }
}