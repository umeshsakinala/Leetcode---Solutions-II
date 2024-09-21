class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> li = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            li.add(String.valueOf(i));
        }
        Collections.sort(li);
        List<Integer> li2 = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            li2.add(Integer.valueOf(li.get(i-1)));
        }
        return li2;
    }
}