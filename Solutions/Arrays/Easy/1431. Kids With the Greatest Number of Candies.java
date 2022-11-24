class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            boolean res=true;
            int max=candies[i]+extraCandies;
            for(int j=0; j<candies.length; j++){
                if(max<candies[j]){
                    res=false;
                    break;
                }
            }
            ans.add(res);
        }
        return ans;
    }
}