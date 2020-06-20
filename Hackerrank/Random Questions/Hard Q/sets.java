import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class sets{
public static void main(String[] args){

int arr[]={5,5,7,7,9,9,3,2};
Arrays.sort(arr);
int temp=0,count=0;
int min=arr[0];
Set<Integer> hashSet=new TreeSet<>();
for(int i=1; i<arr.length; i++){
hashSet.add(arr[i]);
}


for(int i:hashSet){
if(i%min==0){ 
temp++;
}
else if(i%min!=0){
count++;
}
}
if(temp>0){
count++;
}
System.out.println(count);
}
}



