class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
int point=0,tank=0;
int j=0;

for(int i=0; i<gas.length; i++) {   
tank=(tank+gas[i])-cost[i];
if(tank<0){
tank=0;
point=i+1;   
}   
}
        
for(int i=0; i<=point; i++) {   
if(tank<0) return -1;
tank=(tank+gas[i])-cost[i];
if(i==point) return point;
}

throw new IllegalArgumentException ("NO SOLUTION FOUND");       
        
}
}