import java.util.*;
import java.util.regex.*;

class Skill_Matching
{
        Map<String, Double> TeamA_Map=new HashMap<>();        //To store the AverageScore of TeamA 
        List<String> TeamA_List=new ArrayList<>();           //To store the player in the sequence so,Later we can get the players from the map in the correct order 

    
	HashMap<String, Double> TeamB_Map=new HashMap<>();    //To store the AverageScore of TeamB corresponding to the players
	List<String> TeamB_List=new ArrayList<>();           //To store the player in the sequence so,Later we can get the players from the map in the correct order 

	
	
	public void TeamA(String players[], int score[]){      //Method for forming TeamA
	
	     for(int i=1; i<players.length; i++){
        
	         double AverageScore_TeamA=(score[0]+(double)(score[i]))/2;          //Storing the average score of players in the Map
	         TeamA_Map.put((players[0]+","+players[i]), AverageScore_TeamA);     //Storing the Sequence of players in the list
                 TeamA_List.add((players[0]+","+players[i]));                      
	    }
	}
	 	
	public void TeamB(String players[], int score[]){       //Method for forming TeamB
		    
		    int pointer=-1;
		    double min=Integer.MAX_VALUE;         // To get the minimum AverageScore difference two formed team 
		
	     for(int step1=1; step1<players.length; step1++){
	            pointer++;
		    min=Integer.MAX_VALUE;
	            String str="";
	            double formula=0;
	
	     for(int step2=1; step2<players.length-1; step2++){
			
		    if(players[step1]!=players[step2]){
						   
	     for(int step3=step2+1; step3<players.length; step3++){
					
		    if(players[step3]!=players[step1]){
						   
		          double AvgerageScore_TeamB=(score[step2]+(double)(score[step3]))/2;   //calculating the AverageScore of TeamB 
			  double value=TeamA_Map.get(TeamA_List.get(pointer));                 //calculating thr AverageScore difference between TeamA and TeamB to be formed 
						   
		    if(min>Math.abs(value-AvgerageScore_TeamB)){   

		          min=Math.abs(value-AvgerageScore_TeamB);     //finding which is the possible combination having minimum difference 
			  str=players[step2]+","+players[step3];       //saving the name of the formed team having minimum diff of AverageScore bet. them   
                          formula=AvgerageScore_TeamB;                 //and saving their average score 
		     }

                }
		}		
	        }
		}

			  TeamB_Map.put(str,formula);   //storing the averagescore for the corresponding player 
			  TeamB_List.add(str);          // setting up the player in order to get the values from the map 
	        }
            }

	public void Show(String[] players){   //Printing the output in the given format

			for(int i=0; i<players.length-1; i++){

			System.out.println( (TeamA_List.get(i)+ " (" +TeamA_Map.get(TeamA_List.get(i))+")") 
							                +" vs "+
					    (TeamB_List.get(i)+" (" +TeamB_Map.get(TeamB_List.get(i))+")") );
		        }
        }
	
 }

class runner{	
	public static void main(String[] args)
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        String[] players=new String[n];
        int score[]=new int[n];

        for(int i=0; i<n; i++){
            players[i]=in.next();
            score[i]=in.nextInt();
        }
        
	Skill_Matching sc=new Skill_Matching();
        sc.TeamA(players,score);
	sc.TeamB(players,score);
        sc.Show(players);

        in.close();
    }
}