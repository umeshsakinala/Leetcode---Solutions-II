class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        vector<int> answer(nums.size(), 1);
        vector<int> hash(nums.size(), 1);
        int maxi = 1;
        int last = 0;
        sort(nums.begin(), nums.end());
        for(int i=0; i<nums.size(); i++)
        {
            hash[i] = i;
            for(int j=0; j<i; j++)
            {
                if(nums[i]%nums[j] == 0 && answer[i] < answer[j]+1)
                {
                    answer[i] = answer[j] + 1;
                    hash[i] = j;
                }
            }
            if(answer[i] > maxi)
            {
                maxi = answer[i];
                last = i;
            }
        }
        vector<int> temp;
        temp.push_back(nums[last]);
        while(hash[last] != last)
        {
            last = hash[last];
            temp.push_back(nums[last]);
        }
        reverse(temp.begin(), temp.end());
        return temp;
    }
};