class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int x=1;x<=Math.min(a,b);x++){
            if(a%x==0 && b%x==0){
                count++;
            }
        }
        return count;
    }
}