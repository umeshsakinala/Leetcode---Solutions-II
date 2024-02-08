class Solution {
public:
vector<int> dp;
    int numSquares(int n) {
        dp.resize(n+1, -1);
        return square(n);
    }
    int square(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n < 0)
        {
            return INT_MAX;
        }
        if(dp[n] != -1)
        {
            return dp[n];
        }
        int answer = INT_MAX;
        for(int i=1; i <= sqrt(n); i++)
        {
            answer = min(answer, 1+square(n-(i*i)));
        }
        dp[n] = answer;
        return answer;
    }
};