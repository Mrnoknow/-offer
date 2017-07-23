public:
    void push(int node) {           
        stack1.push(node);       
    }
    int pop() {
        int num;
        if(!stack2.empty()) {
            num=stack2.top();
            stack2.pop();
           	return num;
        }else if(!stack1.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.top());
                stack1.pop();
            }
            num=stack2.top();
            stack2.pop();
           	return num;
        }
        else return 0;
    }

private:
    stack<int> stack1;
    stack<int> stack2;