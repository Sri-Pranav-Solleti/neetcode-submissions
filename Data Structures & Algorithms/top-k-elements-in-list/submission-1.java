class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int buckets[] = new int[2 * 1000 + 2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int ele = nums[i];
            buckets[1000 + ele]++;
        }
        int arr[] = new int[k];
        int it = 0;
        int vis[] = new int[2 * 1000 + 2];
        while (it < k) {
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] > max && vis[i] == 0) {
                    max = buckets[i];
                    idx = i;
                }
            }
            vis[idx] = 1;
            arr[it] = idx - 1000;
            it++;
        }
        return arr;
    }
}
