class Solution {
    public boolean isprime(int temp) {
        for(int i=2; i<=Math.sqrt(temp); i++) if(temp%i == 0) return false;
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int num = nums[0];
            if(i != 0) num = nums[i] - nums[i-1];
            if(num <= 0) return false;
            int prime = 0;
            for(int j=num-1; j>=2; j--) {
                if(isprime(j)) {
                    prime = j;
                    break;
                }
            }
            nums[i] = nums[i] - prime;
        }
        return true;
    }
}