class MinStack {

    private int[][] stack;
    private int size;
    
    public MinStack() {
        this.stack = new int[4][2];
        this.size = 0;
    }
    
    public void push(int val) {
        if(size == 0) {
            stack[size++] = new int[]{val, val};
            return;
        }
        if(stack.length == size){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        int minValue = Math.min(val, stack[size-1][1]);
        stack[size++] = new int[]{val, minValue};
    }
    
    public void pop() {
        if(size == 0) return;
        stack[--size] = null;
    }
    
    public int top() {
        return stack[size - 1][0];
    }
    
    public int getMin() {
        return stack[size-1][1];
    }
}
