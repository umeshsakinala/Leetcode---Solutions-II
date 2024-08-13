class Solution {
    public void allCombinations(List<List<Integer>> li, List<Integer> temp, int[] candidates, int target, int index) {
        if(target < 0) return ;
        else if(target == 0) {
            li.add(new ArrayList<Integer>(temp));
        }
        else {
            for(int i=index; i<candidates.length && target >= candidates[i]; i++) {
                if(i > index && candidates[i] == candidates[i-1]) continue;
                temp.add(candidates[i]);
                allCombinations(li, temp, candidates, target-candidates[i], i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(candidates);
        allCombinations(li, new ArrayList<Integer>(), candidates, target, 0);
        return li;
    }
}