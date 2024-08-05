class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<String, Integer>();
        for(int i=0; i<arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for(Map.Entry<String, Integer> i : mp.entrySet()) {
            if(i.getValue() == 1) {
                count++;
                if(count == k) return i.getKey();
            }
        }
        return "";
    }
}