class Solution {
public:
int countOnes(string& bankRow)
{
    int ones = 0;
    for(int i=0; i<bankRow.size(); i++)
    {
        if(bankRow[i] == '1')
        {
            ones++;
        }
    }
    return ones;
}
    int numberOfBeams(vector<string>& bank) {
        int count = 0;
        int row = 0;
        for(int i=0; i<bank.size(); i++)
        {
            int row_ones = countOnes(bank[i]);
            if(row_ones != 0)
            {
                count = count + (row * row_ones);
                row = row_ones;
            }
        }
        return count;
    }
};