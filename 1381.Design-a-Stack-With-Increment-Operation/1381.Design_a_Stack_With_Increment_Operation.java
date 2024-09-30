class CustomStack {
    List<Integer> li;
    int size;
    public CustomStack(int maxSize) {
        li = new ArrayList<Integer>(maxSize);
        size = maxSize;
    }
    
    public void push(int x) {
        if(li.size() != size) li.add(x);
    }
    
    public int pop() {
        if(li.size() == 0) return -1;
        else return li.remove(li.size()-1);
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<li.size(); i++) {
            int temp = li.get(i)+val;
            li.set(i, temp);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */