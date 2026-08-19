class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            set1.add(nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count = 1;
            int num = nums[i];
            if(!set1.contains(num - 1)){
                while(set1.contains(num+1)){
                    num++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return  max != Integer.MIN_VALUE ? max : 0;
    }
}
