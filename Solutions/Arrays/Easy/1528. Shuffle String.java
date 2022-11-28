class Solution {
    public String restoreString(String s, int[] indices) {
        char c[]=new char[indices.length];
        String ans="";
        for(int i=0; i<indices.length; i++){
            c[indices[i]]=s.charAt(i);
        }
        for(int i=0; i<indices.length; i++){
            ans+=c[i];
        }
        return ans;
    }
}

//Best Solution
class Solution {
    public String restoreString(String s, int[] indices) {
        char c[]=new char[indices.length];
        for(int i=0; i<indices.length; i++){
            c[indices[i]]=s.charAt(i);
        }
        return new String(c);
    }
}