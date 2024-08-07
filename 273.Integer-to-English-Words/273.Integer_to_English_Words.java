class Solution {
    public String[] nums = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String[] thousands = {"", "Thousand", "Million", "Billion"};
    public String compute(int num) {
        if(num == 0) return "";
        else if(num < 20) return nums[num] + " ";
        else if(num < 100) return tens[num/10] + " " + compute(num%10);
        else return nums[num/100] + " Hundred " + compute(num%100);
    }
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        int i=0;
        String word = "";
        while(num > 0) {
            if(num%1000 != 0) {
                word = compute(num%1000) + thousands[i] + " " + word;
            }
            num = num/1000;
            i++;
        }
        return word.trim();
    }
}