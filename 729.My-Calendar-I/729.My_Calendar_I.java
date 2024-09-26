class MyCalendar {
    TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        Integer x = mp.floorKey(start);
        Integer y = mp.ceilingKey(start);
        if(x != null && mp.get(x) > start) return false;
        if(y != null && y < end) return false;
        mp.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */