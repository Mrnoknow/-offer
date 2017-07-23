Queue<Integer> num1=new PriorityQueue<Integer>();
    Queue<Integer> num2=new PriorityQueue<Integer>();
    public void Insert(Integer num) {
       num1.offer(num);
       num2.offer(-num1.poll());
       if(num1.size()<num2.size()){
           num1.offer(-num2.poll());
       }
    }

    public Double GetMedian() {
        return num1.size()>num2.size()?num1.peek():(num1.peek()-num2.peek())/2.0;
    }
