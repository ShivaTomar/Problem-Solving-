public class prefix_sum{
public static void main(String[] args){

int arr[]={1,2,3,4,5};
int temp[]=new int[arr.length];

int sum;
for(int i=0; i<arr.length; i++){
if(i==0){
temp[i]=arr[i];
}

else{
sum=arr[i]+temp[i-1]; 
temp[i]=sum;
}

}

for(int j=0; j<temp.length; j++){
System.out.print(temp[j]+" ");
}

}
}