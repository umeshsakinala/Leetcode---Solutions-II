class Solution {
public:
    bool halvesAreAlike(string s) {
        int i=0;
        int j=s.size()-1;
        int icount = 0;
        int jcount = 0;
        transform(s.begin(), s.end(), s.begin(), ::tolower);
        while(i < j)
        {
            if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
            {
                icount++;
            }
            if(s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u')
            {
                jcount++;
            }
            i++;
            j--;
        }
        return icount == jcount;
    }
};