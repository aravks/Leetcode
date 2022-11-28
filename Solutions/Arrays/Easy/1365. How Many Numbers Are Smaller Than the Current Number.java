class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}

//Best solution

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        int[] count=new int[101];
        
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        for(int i=1; i<101; i++){
            count[i]+=count[i-1];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                ans[i]=0;
            } else {
                ans[i]=count[nums[i]-1];
            }
        }
        return ans;
    }
}