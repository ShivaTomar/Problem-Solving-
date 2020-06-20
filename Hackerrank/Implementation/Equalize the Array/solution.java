import java.util.*;
public class solution{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int freq=0;
List<Integer> list=new ArrayList<>();
int n=sc.nextInt();
for(int c=0; c<n; c++){
list.add(sc.nextInt());
}


int max=Integer.MIN_VALUE;
for(int i=0; i<list.size(); i++){
freq=Collections.frequency(list, list.get(i));
max=Math.max(max, freq);
}
int deletion=list.size()-max;
System.out.println(deletion);
}
}





