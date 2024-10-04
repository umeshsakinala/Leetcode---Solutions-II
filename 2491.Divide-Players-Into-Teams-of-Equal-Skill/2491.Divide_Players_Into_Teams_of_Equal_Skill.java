class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = 0;
        long target = skill[0] + skill[skill.length-1];
        for(int i=0; i<skill.length/2; i++) {
            int temp = skill[i] + skill[skill.length-i-1];
            if(temp != target) return -1;
            long chemistry = skill[i]*skill[skill.length-i-1];
            sum = sum + chemistry;
        }
        return sum;
    }
}