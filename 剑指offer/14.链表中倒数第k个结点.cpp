 ListNode* FindKthToTail(ListNode* pListHead, unsigned int k) {
        if(pListHead==NULL||k==0) return NULL;
        ListNode *p=pListHead;
        ListNode *b=pListHead;
        while(k>1&&p->next!=NULL){
            p=p->next;
            k--;
        }
        if(k>1) return NULL;
        while(p->next!=NULL){
            p=p->next;
            b=b->next;
        }
        return b;
    }