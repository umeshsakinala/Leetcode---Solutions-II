class Solution {
    public String largestNumber(int[] nums) {
        String str_nums[] = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            str_nums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str_nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        if(str_nums[0].equals("0")) return "0";
        String ans = "";
        for(String a: str_nums) {
            ans = ans + a;
        }
        return ans;
    }
}