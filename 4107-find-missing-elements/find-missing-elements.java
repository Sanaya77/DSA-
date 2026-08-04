class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans= new ArrayList<>();

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for(int i=max;i>=min;i--){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}