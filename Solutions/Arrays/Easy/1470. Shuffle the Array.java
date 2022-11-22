class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0, j=0; i<n; i++, j=j+2) ans[j]=nums[i];
        
        for(int i=n, j=1; i<nums.length; i++, j=j+2) ans[j]=nums[i];
        
        return ans;
    }
}