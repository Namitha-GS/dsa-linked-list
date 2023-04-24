static int getNthNode(Node head, int index)
{
    Node temp = head;
    int count = 0;
    while(temp != null){
        if(count == index){
            return temp.data;
        }
        temp = temp.next;
        count++;
    }
    return -1;
    
}
