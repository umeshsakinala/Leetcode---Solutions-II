class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        int arr[2][2000] {};
        for(int i=0; i<text1.size(); i++)
        {
            for(int j=0; j<text2.size(); j++)
            {
                if(text1[i] == text2[j]) {arr[!(i % 2)][j + 1] = arr[i%2][j]+1;}
                else{arr[!(i % 2)][j + 1] = max(arr[i % 2][j + 1], arr[!(i % 2)][j]);}
            }
        }
        return arr[text1.size() % 2][text2.size()];
    }
};