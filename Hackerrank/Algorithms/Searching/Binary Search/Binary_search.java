import java.util.*;
public class Binary_search{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int arr[]={1,2,4,5,7,8,9};
Arrays.sort(arr);
int k=sc.nextInt();
int i=arr[0];
int j=arr.length-1;

int mid=(i+j)/2;
System.out.println("Default mid="+mid); //3

while(i<=j){
if(arr[mid]==k){ 
System.out.println(arr[mid]+"=="+k);
System.out.println("Element found ="+k+ " at " +mid);
break;
}
else if(arr[mid]<k){
i=mid+1;
System.out.println("New index of i is now:"+i);
}
else{
j=mid-1;
System.out.println("New index of j is now:"+j);
}
mid=(i+j)/2;
}
if(i>j){
System.out.println("element not found");
}
}
}