class Solution {
public:
    int minOperations(vector<int>& nums) {
        int count = 0;
        int answer = 0;
        sort(nums.begin(), nums.end());
        for(int i=0; i<nums.size();)
        {
            int temp = nums[i];
            for(i; i<nums.size() && temp == nums[i]; i++)
            {
                count++;
            }
            if(count == 1)
            {
                return -1;
            }
            else if(count%3 == 0)
            {
                answer = answer + count/3;
            }
            else if(count%3 == 1)
            {
                answer = answer + 2 + (count-4)/3;
            }
            else if(count%3 == 2)
            {
                answer = answer + 1 + (count-2)/3;
            }
            count = 0;
        }
        return answer;
    }
};