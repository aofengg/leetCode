public class MovingAverage {
    Queue<Integer> queue;
    int max;
    int capacity = 0;
    double sum = 0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<>();
        max = size;
    }
    
    public double next(int val) {
        if(capacity < max) {
            capacity++;
            queue.add(val);
            sum += val;
            return sum / capacity;
        } else {
            sum -= queue.poll();
            sum += val;
            queue.add(val);
            return sum / capacity;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */