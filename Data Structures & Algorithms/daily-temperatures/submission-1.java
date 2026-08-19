class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.add(i);
                res[i] = 0;
            } else {
                if (temperatures[i] >= temperatures[st.peek()]) {
                    while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]) {
                        st.pop();
                    }
                    if (st.isEmpty()) {
                        res[i] = 0;
                    } else {
                        res[i] = st.peek() - i;
                    }
                    st.add(i);
                } else {
                    res[i] = st.peek() - i;
                    st.add(i);
                }
            }
        }
        return res;
    }
}
