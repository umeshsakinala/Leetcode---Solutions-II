class Solution {
public:
int mod = 1e9 + 7;
    int sumSubarrayMins(vector<int>& arr) {
        stack<int> st;
        long sumOfMinimums = 0;
        for(int i = 0; i <= arr.size(); i++)
        {
            while (!st.empty() && (i == arr.size() || arr[st.top()] >= arr[i])) {
                int mid = st.top();
                st.pop();
                int leftBoundary = st.empty() ? -1 : st.top();
                int rightBoundary = i;

                long count = (mid - leftBoundary) * (rightBoundary - mid) % mod;

                sumOfMinimums += (count * arr[mid]) % mod;
                sumOfMinimums %= mod;
            }
            st.push(i);
        }
        return static_cast<int>(sumOfMinimums);
    }
};