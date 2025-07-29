class Solution {
    public int searchInsert(int[] nums, int target) {

        int pos = 0;

        for(int i =0; i<nums.length;i++){
            
            if(nums[i] == target ){
                pos = i;
                break;
            }

            if(nums[i] > target){
                pos = i;
                break;
            }else{
                pos = nums.length;
            }
        
            
        }
        return pos;
    }
}