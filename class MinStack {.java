class MinStack {
    
   
   
     private Stack<Integer> min =  new Stack<Integer>();
    private Stack<Integer> max = new Stack<Integer>();
    

    public void push(int x) {
        if(min.isEmpty() || x <= min.peek()){
            min.push(x);
        }
        max.push(x);
    }

    public void pop() {
    
       int m  = max.pop();
       if(m == min.peek()){
          min.pop(); 
       }
       
    }

    public int getMin() {
        return min.isEmpty() ? Integer.MAX_VALUE :min.peek();
    }
     public int top() {
        if(max.isEmpty()){
            return -1;
        }
        return max.peek();
        
    }

}
