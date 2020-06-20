import java.util.*;
class shiva{
    public static void main(String[] args){
		
        Scanner sc=new Scanner(System.in);
		
		String status=sc.nextLine();
		int n=status.length()+1;
		
		char[] Input=new char[n];
		for(int cou=0; cou<Input.length-1; cou++) Input[cou]=status.charAt(cou);
		Input[Input.length-1]='g';
	
		
        int i=0;
        int seen=Input[i],consecutive=0,swap=0;
        for(int j=0; j<Input.length; j++){
			
            if(seen==Input[j]) consecutive++;

            else if(seen!=Input[j]){
                if(consecutive>1){
                    if(i==0 && consecutive%2==0){
                        while(i!=j){
                            if(i!=j){
                                if(seen=='s') Input[i]='r';
                                else if(seen=='r') Input[i]='s';
				swap++;
                                i=i+2;
                            }
                        }
                    }
                    else{
                        while(i!=j){
                            i++;
                            if(i!=j){
                                if(seen=='r') Input[i]='s';
                                else if(seen=='s') Input[i]='r';
				swap++;
                                i++;
                            }
                        }
                    }
					i--;
					j--;
					seen=Input[j];
					consecutive=1;
                }
                else{
                    i=j;
                    seen=Input[j];
                    consecutive=1;
                }

            }
        }
		
	System.out.println("swaps="+swap);
    }
}