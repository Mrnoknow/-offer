vector<int> num;
    vector<int> printListFromTailToHead(ListNode* head) {
        std::stack<int> node;
        if(head==NULL) return num;
        while(head!=NULL){
            node.push(head->val);
            head=head->next;
        }
        while(!node.empty()){
            num.push_back(node.top());
            node.pop();
        }
        return num;
    }