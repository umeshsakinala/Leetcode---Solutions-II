class Solution {
public:
    int rob(vector<int>& nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<nums.size(); i++)
        {
            int temp = max(sum1 + nums[i], sum2);
            sum1 = sum2;
            sum2 = temp;
        }
        return sum2;
    }
};