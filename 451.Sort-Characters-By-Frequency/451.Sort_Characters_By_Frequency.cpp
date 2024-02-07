class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> mp;
        for(int i=0; i<s.size(); i++)
        {
            mp[s[i]]++;
        }
        auto compare = [&](char a, char b) {
            if(mp[a] == mp[b])
            {
                return a<b;
            }
            return mp[a] > mp[b];
        };
        sort(s.begin(), s.end(), compare);
        return s;
    }
};