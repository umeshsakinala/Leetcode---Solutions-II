class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<Integer[]> li = new ArrayList<Integer[]>();
        for(int i: nums) {
            String str = String.valueOf(i);
            String temp = "";
            for(int j=0; j<str.length(); j++) {
                temp = temp + String.valueOf(mapping[str.charAt(j) - '0']);
            }
            li.add(new Integer[] {Integer.valueOf(temp), i});
        }
        for(int i=0; i<li.size(); i++) {
            System.out.println(li.get(i)[0] + " " + li.get(i)[1]);
        }
        System.out.println("After");
        Collections.sort(li, (x, y) -> (x[0] - y[0]));
        for(int i=0; i<li.size(); i++) {
            System.out.println(li.get(i)[0] + " " + li.get(i)[1]);
        }
        for(int i=0; i<li.size(); i++) {
            nums[i] = li.get(i)[1];
        }
        return nums;
    }
}