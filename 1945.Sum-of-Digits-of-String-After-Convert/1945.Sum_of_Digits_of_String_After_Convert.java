class Solution {
    public int getLucky(String s, int k) {
        int total = 0;
        String string = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c + " ");
            int temp = c-'a'+1;
            string = string + String.valueOf(temp);
        }
        System.out.println(string);
        while(k-- > 0) {
            int sum = 0;
            for(int i=0; i<string.length(); i++) {
                int temp = string.charAt(i) - '0';
                sum = sum + temp;
            }
            total = sum;
            string = String.valueOf(sum);
        }
        return total;
    }
}