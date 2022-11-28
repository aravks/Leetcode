class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decoded=new int[encoded.length+1];
        for(int i=0; i<=encoded.length; i++){
            if(i==0){
                decoded[i]=first;
            }
            else{
                decoded[i]=decoded[i-1]^encoded[i-1];
            }
        }
        return decoded;
    }
}

//Best solution
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length, dec[]=new int[n+1];
        dec[0]=first;
        for(int i=0; i<n; i++){
            dec[i+1]=dec[i]^encoded[i];
        }
        return dec;
    }
}