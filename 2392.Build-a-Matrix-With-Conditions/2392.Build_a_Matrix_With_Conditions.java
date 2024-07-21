class Solution {
    public void get_stack(Stack<Integer> st, List<Integer> li) {
        while(st.size() > 0) {
            li.add(st.pop());
        }
    }
    public boolean dfs(Stack<Integer> st, List<List<Integer>> li, int i, int[] visited, int[] flag) {
        if(flag[i] == 1) return false;
        if(visited[i] == 1) return true;
        visited[i] = 1;
        flag[i] = 1;
        for(int a : li.get(i)) {
            if(dfs(st, li, a, visited, flag) == false) return false;
        }
        flag[i] = 0;
        st.push(i);
        return true;
    }
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<List<Integer>> row = new ArrayList<>();
        List<List<Integer>> col = new ArrayList<>();
        for(int i=0; i<=k; i++) {
            row.add(new ArrayList<Integer>());
            col.add(new ArrayList<Integer>());
        }
        for(int i=0; i<rowConditions.length; i++) {
            row.get(rowConditions[i][0]).add(rowConditions[i][1]);
        }
        for(int i=0; i<colConditions.length; i++) {
            col.get(colConditions[i][0]).add(colConditions[i][1]);
        }
        int visited_row[] = new int[k+1];
        int visited_col[] = new int[k+1];
        int flag_row[] = new int[k+1];
        int flag_col[] = new int[k+1];
        List<Integer> topo_row = new ArrayList<Integer>();
        List<Integer> topo_col = new ArrayList<Integer>();
        Stack<Integer> st_row = new Stack<Integer>();
        Stack<Integer> st_col = new Stack<Integer>();
        for(int i=1; i<=k; i++) {
            if(visited_row[i] == 0) {
                if(dfs(st_row, row, i, visited_row, flag_row) == false) return new int[0][0];
            }
        }
        for(int i=1; i<=k; i++) {
            if(visited_col[i] == 0) {
                if(dfs(st_col, col, i, visited_col, flag_col) == false) return new int[0][0];
            }
        }
        get_stack(st_row, topo_row);
        get_stack(st_col, topo_col);
        int[][] ans = new int[k][k];
        int[] row_pos = new int[k + 1];
        int[] col_pos = new int[k + 1];
        for(int i = 0; i < k; i++) {
            row_pos[topo_row.get(i)] = i;
            col_pos[topo_col.get(i)] = i;
        }
        for(int i = 1; i <= k; i++) {
            ans[row_pos[i]][col_pos[i]] = i;
        }
        return ans;
    }
}