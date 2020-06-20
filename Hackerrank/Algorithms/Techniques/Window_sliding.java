public class Window_sliding{
public static void main(String[] args){

int arr[]={1,2,3,4,5};
int wsum=0;
int max=Integer.MIN_VALUE;
int k=3;

for(int i=0; i<k; i++){
wsum=wsum+arr[i];
if(max<wsum){
max=wsum;
}
}

for(int j=k; j<arr.length; j++){
wsum=wsum+arr[j]-arr[j-k];
if(max<wsum){
max=wsum;
}
}
System.out.println("MAX = "+max);
}
}