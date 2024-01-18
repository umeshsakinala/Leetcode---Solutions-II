class Solution {
public:
    int climbStairs(int n) {
        long long int step_1 = 1;
        long long int step_2 = 1;
        for(int i=0; i<n; i++)
        {
            long long int step = step_1;
            step_1 = step_1 + step_2;
            step_2 = step;
        }
        return step_2;
    }
};