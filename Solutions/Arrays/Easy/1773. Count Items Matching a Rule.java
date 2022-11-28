class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> item=new ArrayList<>();
        List<String> attr=new ArrayList<>();
        attr.add("type");
        attr.add("color");
        attr.add("name");
        int count=0;
        for(int i=0; i<items.size(); i++){
            item=items.get(i);
            for(int j=0; j<3; j++){
                
                if(attr.get(j).equals(ruleKey) && item.get(j).equals(ruleValue)) count++;
            }
        }
        return count;
    }
}

//Best Solution
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;
        
    }
}