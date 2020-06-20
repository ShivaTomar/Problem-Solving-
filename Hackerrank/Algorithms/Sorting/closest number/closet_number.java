import java.util.*;
class closet_number{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}



Arrays.sort(arr);
int min=arr[1]-arr[0];
int diff;
for(int i=0;i<n-1;i++){
diff=arr[i+1]-arr[i];
if(min>=diff){
min=diff;
}
}
for(int j=0;j<n-1;j++){
diff=arr[j+1]-arr[j];
if(min==diff){
System.out.print(arr[j]+" "+arr[j+1]+" ");
}
}

}
}


















//int arr[]={-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854};
//int arr[]={1,2,3,4,5};

//System.out.println(arr[i+1]+"-"+arr[i]+"="+diff);