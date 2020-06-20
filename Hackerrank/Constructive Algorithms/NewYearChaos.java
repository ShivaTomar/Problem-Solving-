public class NewYearChaos {

    static void swap(int q[], int a, int b){
        int temp;
        temp=q[a];
        q[a]=q[b];
        q[b]=temp;
    }

    static void minimumBribes(int[] q) {
        int count=0;
        boolean flag=false;

        for(int i=q.length-1; i>0; i--){
            if(  q[i]!=i+1    ){
                if(q[i-1]==i+1){
                    swap(q,i,i-1);
                    count++;
                }
                else if( q[i-2]==i+1 ){
                    count+=2;
                    swap(q,i-2,i-1);
                    swap(q,i-1,i);
                    
                }
                else if(q[i-1]!=i+1 && q[i-2]!=i+1){
                    System.out.println("Too chaotic");
                    flag=true;
                    break;
                }

                
            }
        }
        if (flag==false){
            System.out.println(count);
        }
        
    }

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

   int[] q = sc.nextInt();

   for (int i = 0; i < n; i++) {
   int q[i]=sc.nextInt();
        
        }
     minimumBribes(q);
    }
}
