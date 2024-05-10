class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Double> ans = new ArrayList<>();
        List<String> str_ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                double fraction = (double) arr[i] / arr[j];
                ans.add(fraction);
                str_ans.add(arr[i] + " " + arr[j]);
            }
        }
        Collections.sort(ans);
        k--;
        double result = ans.get(k);
        int[] res = new int[2];
        for(int i = 0; i < str_ans.size(); i++) {
            String[] parts = str_ans.get(i).split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            double fraction = (double) x / y;
            if(fraction == result) {
                res[0] = x;
                res[1] = y;
                break;
            }
        }
        return res;
    }
}
