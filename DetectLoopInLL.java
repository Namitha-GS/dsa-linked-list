static int hasLoop(Node head)
{
    Node slow,fast;
    slow = fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return 1;
        }
    }
    return 0;
}
