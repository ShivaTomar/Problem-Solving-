import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class highestocc{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long d;
        int n = sc.nextInt();
        int k=sc.nextInt();
k=k-1;
        long[] arr = new long[n];
        for(int t=0; t<n; t++){
        arr[t]=sc.nextLong();
        
        }
Arrays.sort(arr);
long x=arr[k]-arr[0];

for(int i=0; i<n-k; i++){
d=arr[i+k]-arr[i];
System.out.println(arr[i+k]+"-"+arr[i]+"="+d);
if(d<x){
x=d;
}
}
System.out.println(x);
}
}
