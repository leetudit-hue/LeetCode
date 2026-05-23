class MinStack {
    Stack<Long>st = new Stack<>();
    public MinStack() {
        
    }
    long min;
    public void push(int val) {
        if(st.size() == 0){
            st.push((long)val);
            min = (long)val;
        }
        else if(val >= min){
            st.push((long)val);
        }
        else{
            st.push((long)(2L*val)-min);
            min = (long)val;
        }
    }
    
    public void pop() {
        if(st.size() == 0) return;
        else if(st.peek() >= min) st.pop();
        else{
            min = (2L*min)-st.pop();
        } 
    }
    
    public int top() {
        if(st.size() == 0) return -1;
        else if(st.peek()>=min) 
        {   
            long x = st.peek();
            return (int)x;
        }
        else{
            return (int)min;
        }
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */