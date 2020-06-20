import java.util.*;
public class test {

static void swap(int arr[], int i, int j){
int temp=0;
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

public static void main(String[] args){

int arr[]={3,2,1};

int count=1;
int i=0,j=i+1;


while(i<arr.length-1){

if(count%2!=0){
if(arr[i]>arr[j]) swap(arr, i ,j);
}

else{
if(arr[i]<arr[j]) swap(arr, i ,j);
}

i++;
j++;
count++;
}

System.out.println(Arrays.toString(arr));
}
}
