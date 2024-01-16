class RandomizedSet {
public:
unordered_map<int, int> map;
vector<int> arr;
    RandomizedSet() {
        
    }
    
    bool insert(int val) {
        if(map.count(val))
        {
            return false;
        }
        else
        {
            arr.push_back(val);
            map[val] = arr.size()-1;
            return true;
        }
    }
    
    bool remove(int val) {
        if(map.count(val))
        {
            int index = map[val];
            int last = arr.back();
            arr[index] = last;
            arr.pop_back();
            map[last] = index;
            map.erase(val);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    int getRandom() {
        int random = rand() % arr.size();
        return arr[random];
    }
};

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */