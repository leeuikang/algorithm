import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<Integer> list;
    int top;
    int min;
    int minIndex;
    public MinStack() {
        list = new ArrayList<>();
        top = 0;

    }
    
    public void push(int val) {
        list.add(val);
        top++;

    }
    
    public int pop() {
        int value = top();
        list.remove(top - 1);
        top--;
        return value;
    }
    
    public int top() {
        return list.get(top - 1);
    }
    
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(min > list.get(i)){
                min = list.get(i);
                index = i;
            }
        }
        return list.get(index);
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