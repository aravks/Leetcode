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