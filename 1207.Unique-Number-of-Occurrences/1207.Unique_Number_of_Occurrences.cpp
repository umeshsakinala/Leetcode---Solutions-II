class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> frequency;
        for(int i : arr)
        {
            frequency[i]++;
        }
        unordered_set<int> s;
        for(auto i : frequency)
        {
            s.insert(i.second);
        }
        return frequency.size() == s.size();
    }
};