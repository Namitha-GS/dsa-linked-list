static void print_in_reverse(Node head) 
{
   Node cur = head;
   Node prev = null;
   while(cur != null){
       Node temp = cur.next;
       cur.next = prev;
       prev = cur;
       cur = temp;
   }
   head = prev;
   while(head != null){
       System.out.print(head.data+" ");
       head = head.next;
   }
}
