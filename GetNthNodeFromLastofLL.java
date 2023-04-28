int getNthFromLast(Node head, int n)
    {
      int size = 0;
      Node temp = head;
      while(temp != null){
          temp = temp.next;
          size++;
      }
      if(size-n < 0){
          return -1;
      }
      for(int i=0; i<size-n; i++){
          head = head.next;
      }
      return head.data;
    }
