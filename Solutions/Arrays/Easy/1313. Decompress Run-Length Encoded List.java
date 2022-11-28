class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=0, j=1; i<nums.length; i+=2, j+=2){
            for(int t=0; t<nums[i]; t++)
                li.add(nums[j]);
        }
        int n=li.size();
        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}

//Best Solution
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}