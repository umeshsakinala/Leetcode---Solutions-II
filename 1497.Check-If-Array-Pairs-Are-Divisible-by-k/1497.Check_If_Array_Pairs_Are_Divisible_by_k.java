class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i: arr) {
            int rem = ((i%k)+k)%k;
            mp.put(rem, mp.getOrDefault(rem, 0)+1);
        }
        for(int i: arr) {
            int rem = ((i%k)+k)%k;
            if(rem == 0) {
                if(mp.get(rem)%2 == 1) return false;
            }
            else if(Objects.equals(mp.get(rem), mp.get(k-rem)) == false) {
                return false;
            }
        }
        return true;
    }
}