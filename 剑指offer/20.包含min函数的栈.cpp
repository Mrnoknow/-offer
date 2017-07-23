    stack<int> m_data;
    stack<int> m_min;
    void push(int value) {
        m_data.push(value);
        if(m_min.empty()||value<m_min.top()){
            m_min.push(value);	
        }else{
            m_min.push(m_min.top());
        }
    }
    void pop() {
        m_min.pop();
        m_data.pop();
    }
    int top() {
        return m_data.top();
    }
    int min() {
        return m_min.top();
    }