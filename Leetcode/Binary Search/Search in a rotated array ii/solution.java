class Solution {
    public boolean search(int[] nums, int target) {
    
        
        int i=0, h=nums.length-1;
		

		while(i<=h){
            int mid=(i+h)/2;
			if(nums[mid]==target  || nums[i]==target || nums[h]==target){
				return true;
			}
            else if(nums[mid]<nums[h]){
                if(target>nums[mid] && target<nums[h]){
                    i=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
            else if(nums[i]<nums[mid]){
                if(target>nums[i] && target<nums[mid]){
                    h=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else{
                h--;
            }
        }
            
         return h==-1 ? false: false;
        }
    }