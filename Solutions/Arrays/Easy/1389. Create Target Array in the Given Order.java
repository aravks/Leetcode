// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         int target[]=new int[nums.length];
//         for(int i=0; i<nums.length; i++)
//             insert(target, nums[i], index[i]);
//         return target;
        
//     }
//     static int[] insert(int[] tar, int ele, int ind){
//         for(int i=tar.length-1; i>ind; i--){
//             tar[i]=tar[i-1];
//         }
//         tar[ind]=ele;
//         return tar;
//     }
// }

//Best solution
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> li=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            li.add(index[i], nums[i]);
        }
        int tar[]=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            tar[i]=li.get(i);
        }
        return tar;
    }
}