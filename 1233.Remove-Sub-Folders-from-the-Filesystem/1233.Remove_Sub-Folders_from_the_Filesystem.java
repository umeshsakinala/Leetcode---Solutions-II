class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<String>();
        ans.add(folder[0]);
        for(int i=1; i<folder.length; i++) {
            String temp = ans.get(ans.size()-1) + "/";
            if(folder[i].startsWith(temp) == false) ans.add(folder[i]);
        }
        return ans;
    }
}