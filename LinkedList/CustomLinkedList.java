class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
    }
}

public class CustomLinkedList
{
    public Node insert(Node head, int data)
    {
        Node nn = new Node(data);
        if(head==null)
        {
            head = nn;
            return head;
        }

        Node ptr = head;
        while(ptr.next!=null) ptr = ptr.next;
        ptr.next = nn;
        return head;
    }

    public int size(Node head)
    {
        int len = 0;
        Node ptr = head;
        while(ptr!=null){
            ptr = ptr.next;
            len++;
        }
        return len;
    }

    public void printList(Node head)
    {
        Node ptr = head;
        System.out.print("HEAD -> ");
        while(ptr!=null)
        {
            if(ptr.next==null) System.out.print(ptr.data);
            else System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
    }
}
