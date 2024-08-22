class Solution {
    public int findComplement(int num) {
        int temp = num;
        int count = 0;
        while(temp > 0) {
            int rem = temp%2;
            temp = temp/2;
            System.out.print(rem);
            count++;
        }
        long n = (long)Math.pow(2, count) - 1;
        return (int)(num^n);
    }
}