class Solution {
public:
        bool NoDuplicate(int& found,string s){
        for(auto& c:s){
            int pos = c-'a';
            if((1<<pos)&found){
                return false;
            }
            found |= (1<<pos);
        }
        return true;
    }
    int maxLength(vector<string>& arr) {
        int ans = 0,n = arr.size();
        for(int mask=0;mask<(1<<n);mask++){
            int len = 0,ok = 1,found = 0;
            for(int i=0;i<n and ok;i++){
                if((1<<i)&mask){
                    if(!NoDuplicate(found,arr[i])){
                        ok = 0;
                    }
                    else{
                        len += arr[i].length();
                    }
                }
            }
            if(ok){
                ans = max(ans,len);
            }
        }
        return ans;
    }
};