class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                res[i] = 0;
                st.push(i);
            } else {
                while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[i] = 0;
                    st.push(i);
                } else {
                    res[i] = st.peek() - i;
                    st.push(i);
                }
            }
        }
        return res;
    }
}
