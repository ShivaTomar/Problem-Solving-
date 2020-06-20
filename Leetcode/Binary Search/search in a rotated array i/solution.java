class Solution {
    public boolean search(int[] nums, int target) {

int i=0,j=nums.length;

while(i<=j){
int mid=(i+j)/2;
if(mid==target){
return mid;
break;
}
else if(nums[i]<=nums[mid]){
if(nums[i]<=target && nums[mid]>=target){
j=mid-1;
}
else{
i=mid+1;
}
}
else{
if(nums[mid]<=target && nums[j]>=target){
i=mid+1;
}
else{
j=mid-1;
}
}
}
return false;
}
}
