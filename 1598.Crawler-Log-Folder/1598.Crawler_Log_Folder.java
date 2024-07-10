class Solution {
    public int minOperations(String[] logs) {
        int steps = 0;
        for(String i : logs) {
            switch(i) {
                case "../":
                    if(steps != 0) steps--;
                    break;
                case "./":
                    break;
                default:
                    steps++;
                    break;
            }
        }
        return steps;
    }
}