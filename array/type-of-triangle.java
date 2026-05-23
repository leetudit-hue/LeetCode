class Solution {
    public String triangleType(int[] nums) {
        String ans = "none";
        if(nums[0]+nums[1]>nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2]>nums[0]){
            ans = "";
        }
        if(ans == "none"){
            return ans;
        }
        if(nums[0]==nums[1] && nums[0] == nums[2]){
            return "equilateral";
        }
        else if((nums[0]==nums[1] && nums[2]!=nums[0])|| (nums[0] == nums[2] && nums[1]!=nums[0]) || (nums[1] == nums[2] && nums[0]!= nums[1])){
            return "isosceles";
        }
        else{
            return "scalene";
        }
    }
}