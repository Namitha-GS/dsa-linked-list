static int getMiddleNode(Node head)
{
    Node slow, fast;
    slow = fast = head;
    if(head != null){
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow.data;
    }
    return -1;
}
