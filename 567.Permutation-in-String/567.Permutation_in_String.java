class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char charArray[] = s1.toCharArray();
        Arrays.sort(charArray);
        s1 = new String(charArray);
        for(int i=0; i<=s2.length() - s1.length(); i++) {
            String temp = s2.substring(i, i+s1.length());
            char tempchar[] = temp.toCharArray();
            Arrays.sort(tempchar);
            temp = new String(tempchar);
            if(s1.equals(temp)) return true;
        }
        return false;
    }
}