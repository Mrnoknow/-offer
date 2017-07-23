 ListNode* Merge(ListNode* pHead1, ListNode* pHead2)
    {
        if(pHead1==NULL) return pHead2;
        if(pHead2==NULL) return pHead1;
        ListNode *pNode1=pHead1;
        ListNode *pRecord=(ListNode *)malloc(sizeof(ListNode)); 
        
        ListNode *result=pRecord;
        ListNode *pNode2=pHead2;
        while(pNode1&&pNode2){
        	if(pNode1->val<=pNode2->val){
            	pRecord->next=pNode1;
            	pNode1=pNode1->next;  
        	}else{
            	pRecord->next=pNode2;
            	pNode2=pNode2->next;
        	}
            pRecord=pRecord->next;
        }
        if(pNode1==NULL) pRecord->next=pNode2;
        else if(pNode2==NULL) pRecord->next=pNode1;
        return result->next;;
    }