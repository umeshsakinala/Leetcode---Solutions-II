class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramGroup;
        vector<vector<string>> answer;
        vector<string> ans_str = strs;
        for(int i=0; i<strs.size(); i++)
        {
            sort(strs[i].begin(), strs[i].end());
            anagramGroup[strs[i]].push_back(ans_str[i]);
        }
        for(const auto& i : anagramGroup)
        {
            answer.push_back(i.second);
        }
        return answer;
    }
};