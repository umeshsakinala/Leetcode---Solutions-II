class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> ans = new ArrayList<Integer>();
        // We are generating the subarrays here
        for(int i=0; i<9; i++)
        {
            int num = 0;
            // 1st-Iteration -> 1, 12, 123, 1234, 12345, 123456, 1234567, 12345678, 123456789
            // 2nd-Iteration -> 2, 23, 234, 2345, 23456, 234567, 2345678, 23456789
            // 3rd-Iteration -> 3, 34, 345, 3456, 34567, 345678, 3456789
            // 4th-Iteration -> 4, 45, 456, 4567, 45678, 456789
            // 5th-Iteration -> 5, 56, 567, 5678, 556789
            // 6th-Iteration -> 6, 678, 6789
            // 7th-Iteration -> 7, 78, 789
            // 8th-Iteration -> 8, 89
            // 9th Iteration -> 9
            for(int j=i; j<9; j++)
            {
                num = num*10 + nums.get(j);
                if(num >= low && num <= high)
                {
                    ans.add(num);
                }
            }
        }
        ans.sort(null);
        return ans;
    }
}