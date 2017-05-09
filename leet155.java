public class MinStack {
    Stack<Element> stack;
    /** initialize your data structure here. */
    class Element {
        int value;
        int min;
        public Element(int v, int m) {
            value = v;
            min = m;
        }
    }
    
    public MinStack() {
        stack = new Stack<Element>();
    }
    
    public void push(int x) {
        int min = stack.empty()? x : Math.min(x, stack.peek().min);
        stack.push(new Element(x, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */