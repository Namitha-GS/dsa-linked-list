static void print_in_reverse(Node head) 
{
    if(head == null){
        return;
    }
    print_in_reverse(head.next);
    System.out.print(head.data+" ");
}
