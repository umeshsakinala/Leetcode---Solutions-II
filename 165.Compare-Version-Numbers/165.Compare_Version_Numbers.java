class Solution {
    public int compareVersion(String version1, String version2) {
        String[] temp1 = version1.split("\\.", 0);
        String[] temp2 = version2.split("\\.", 0);
        int maxLength = Math.max(temp1.length, temp2.length);
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < maxLength; i++) {
            int num1 = (i < temp1.length) ? Integer.parseInt(temp1[i]) : 0;
            int num2 = (i < temp2.length) ? Integer.parseInt(temp2[i]) : 0;
            if(num1 > num2) return 1;
            if(num1 < num2) return -1;
        }
        return 0;
    }
}
