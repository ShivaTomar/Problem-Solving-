import java.util.*;
public class test {
public static void main(String[] args){

String s1="hi";
String s2="world";
int count=0;

Map<Character,Integer> map= new HashMap<>();

for(int i=0; i<s1.length(); i++){
map.put(s1.charAt(i), i);
}
for(int i=0; i<s2.length(); i++){
if(map.containsKey(s2.charAt(i))){
count++;
break;
}
}
if(count==1){
System.out.println("YES");
}
else{
System.out.println("NO");
}

}
}