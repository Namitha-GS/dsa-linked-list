static int getMiddleNode(Node head)
{
    Node temp = head;
    if(temp != null){
        int length = getLength(temp);
        for(int i=0; i<length/2; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    return -1;
}

static int getLength(Node head){
    int count = 0;
    Node temp = head;
    while(temp != null){
        count++;
        temp = temp.next;
    }
    return count;
}
