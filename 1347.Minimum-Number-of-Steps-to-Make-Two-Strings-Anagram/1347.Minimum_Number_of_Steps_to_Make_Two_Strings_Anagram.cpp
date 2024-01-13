class Solution {
public:
    int minSteps(string s, string t) {
        unordered_map<char, int> mp;
        for(auto i:s)
        {
            mp[i]++;
        }
        int ans = 0;
        for(auto i:t)
        {
            if(mp[i] > 0)
            {
                mp[i]--;
            }
            else
            {
                ans++;
            }
        }
        return ans;
    }
};