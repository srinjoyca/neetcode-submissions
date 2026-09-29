class MinStack {
    int[]stack;
    int[]minvalue;
    int cur;
    public MinStack() {
        this.stack = new int[30001];
        this.minvalue = new int[30001];
        this.cur = 0;
    }
    
    public void push(int val) {
        stack[cur] = val;
        if (cur == 0) {
            minvalue[cur] = val;
        } else {
            if (minvalue[cur-1] > val) {
                minvalue[cur] = val;
            } else {
                minvalue[cur] = minvalue[cur-1];
            }
        }
        cur++;
    }
    
    public void pop() {
        stack[cur-1] = 0;
        minvalue[cur-1] = 0;
        cur--;
    }
    
    public int top() {
        return stack[cur-1];
    }
    
    public int getMin() {
        return this.minvalue[cur-1];
    }
}
