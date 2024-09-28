class MyCircularDeque {
    List<Integer> li;
    int size;
    int currentSize;
    int front;
    int rear;
    
    public MyCircularDeque(int k) {
        li = new ArrayList<Integer>(k);
        for (int i = 0; i < k; i++) {
            li.add(0);
        }
        size = k;
        currentSize = 0;
        front = 0;
        rear = 0;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + size) % size;
        li.set(front, value);
        currentSize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) return false;
        li.set(rear, value);
        rear = (rear + 1) % size;
        currentSize++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % size;
        currentSize--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + size) % size;
        currentSize--;
        return true;
    }
    
    public int getFront() {
        if (isEmpty()) return -1;
        return li.get(front);
    }
    
    public int getRear() {
        if (isEmpty()) return -1;
        return li.get((rear - 1 + size) % size);
    }
    
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    public boolean isFull() {
        return currentSize == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */