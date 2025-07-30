class Solution {
    public int search(int[] nums, int target) {


        int ans = 0;
        // Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                ans = i;
                break;
            }else{
                ans = -1;
            }
        }
        return ans; 

        // Map<Integer,Integer> map = new HashMap<>();
        // int ans =0;

        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(target)){
        //         ans = i;
        //     }
        //     else{map.put(nums[i],i);}
        //     if(!map.containsKey(target)){
        //         ans = -1;
        //     }
        // }
        // return ans;
    }
}