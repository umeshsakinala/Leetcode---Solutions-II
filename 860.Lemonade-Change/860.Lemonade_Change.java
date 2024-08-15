class Solution {
    public boolean lemonadeChange(int[] bills) {
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i : bills) {
            if(i == 5) {
                x++;
            }
            else if(i == 10) {
                // if(x == 0) return false;
                y++;
                x--;
            }
            else {
                if(y >= 1 && x >= 1) {
                    y--;
                    x--;
                    z++;
                }
                else if(x >= 3) {
                    x = x-3;
                    z++;
                }
                else {
                    return false;
                }
            }
        }
        return x >= 0;
    }
}