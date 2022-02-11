/*
* 
*/
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
  ListNode head1 = list1;
  ListNode head2 = list2;
        
  ListNode head = null;
  ListNode tail = null;

  while(true) {
    if(head1 == null && head2 == null) break;

    int head1Val = (head1 != null) ? head1.val : Integer.MAX_VALUE;
    int head2Val = (head2 != null) ? head2.val : Integer.MAX_VALUE;
            
    if(head == null) {
      head = new ListNode(Math.min(head1Val, head2Val));
      tail = head;
    } else {
      tail.next = new ListNode(Math.min(head1Val, head2Val));
      tail = tail.next;
    }

    if(head1Val < head2Val) {
      head1 = head1.next;
    } else if(head2Val < head1Val) {
      head2 = head2.next;
    } else {
      tail.next = new ListNode(Math.min(head1Val, head2Val));
      tail = tail.next;
      head1 = head1.next;
      head2 = head2.next;
    }
  }
  return head;
} 
