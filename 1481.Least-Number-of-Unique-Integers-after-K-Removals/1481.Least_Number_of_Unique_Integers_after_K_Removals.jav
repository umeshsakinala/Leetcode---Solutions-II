class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(map.values());
        while(minHeap.size() > 0 && k > 0 && minHeap.peek() <= k) {
            if(minHeap.peek() <= k) {
                k = k - minHeap.peek();
                minHeap.remove();
            }
        }
        return minHeap.size();
    }
}