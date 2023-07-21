class Program6 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
        min = Math.min(val, minStack.isEmpty() ?val :minStack.peek());
        minStack.push(min);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();

    }

}

//========================SecondMethod===============================
class MinStack {

    ArrayList<Integer> list;
    ArrayList<Integer> minList;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
        minList.add(min);
    }
    
    public void push(int val) {
        if(val <= minList.get(minList.size()-1)){
            minList.add(val);
        }
        list.add(val);
    }
    
    public void pop() {
        int removed = list.remove(list.size()-1);
        if(minList.get(minList.size()-1)== removed){
            minList.remove(minList.size()-1);
        }
        
    }
    
    public int top() {
        return list.get(list.size()-1);
        
    }
    
    public int getMin() {
        return minList.get(minList.size()-1);

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