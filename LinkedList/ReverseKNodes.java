public class ReverseKNodes
{
    private static Node reverseInGroupsOfK(Node head, int k)
    {
        if(head==null || head.next==null) return head;
        CustomLinkedList list = new CustomLinkedList();
        int len = list.size(head);

        Node dummy = new Node(0);
        dummy.next = head;

        Node pre = dummy;
        Node curr, forw;
        while(len>=k)
        {
            curr = pre.next;
            forw = curr.next;

            for(int i = 1; i < k; i++)
            {
                curr.next = forw.next;
                forw.next = pre.next;
                pre.next = forw;
                forw = curr.next;
            }
            pre = curr;
            len-=k;
        }
        return dummy.next;
    }

    public static void main(String args[])
    {
        CustomLinkedList list = new CustomLinkedList();
        Node head = null;
        head = list.insert(head, 1);
        head = list.insert(head, 2);
        head = list.insert(head, 3);
        head = list.insert(head, 4);
        head = list.insert(head, 5);
        head = list.insert(head, 6);
        head = list.insert(head, 7);
        head = list.insert(head, 8);

        System.out.println("Original List---");
        list.printList(head);
        // list.size(head);
        int k = 3;
        head = reverseInGroupsOfK(head, k);

        System.out.println("\nFinal List---");
        list.printList(head);
        
    }
}
