public class solution {
public static void main(String[] args){

int p=20;
int d=3;
int m=6;
int s=85;
int cost=20;
int count = 0;
        while(s>=p){
            count++;
            s -=p;
            p = Math.max(p-d,m);
        }
     System.out.println(count);  
    }
}