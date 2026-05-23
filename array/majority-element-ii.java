class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        int n = nums.length;
        int f1=0;
        int f2=0;
        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(f1 == 0 && nums[i] != ans2){
                f1++;
                ans1 = nums[i];
            }
            else if(f2==0 && nums[i] != ans1){
                f2++;
                ans2 = nums[i];
            }
            else if(nums[i] == ans1){
                f1++;
            }
            else if(nums[i] == ans2){
                f2++;
            }
            else{
                f1--;
                f2--;
            }
        }
        f1 = f2 =0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == ans1) f1++;
            else if(nums[i] == ans2) f2++;
        }
        if(f1 > n/3) ans.add(ans1);
        if(f2 > n/3) ans.add(ans2);
        return ans;
    }
}