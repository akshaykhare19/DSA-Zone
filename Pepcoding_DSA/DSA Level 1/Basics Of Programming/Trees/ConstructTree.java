import java.util.*;

public class ConstructTree
{
    public static class Node
    {
        int data;
        ArrayList<Node> children;

        Node(int data)
        {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    public static void display(Node node)
    {
        String str = node.data + " -> ";
        for(Node child : node.children)
        {
            str+= child.data + ", ";
        }
        str+=". ";
        System.out.println(str);

        for(Node child : node.children)
        {
            display(child);
        }
    }

    public static Node construct(int[] arr)
    {
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);
        for(int i = 1; i < arr.length; i++)
        {
            int num = arr[i];
            if(num != -1)
            {
                Node newNode = new Node(num);
                Node top = st.peek();
                top.children.add(newNode);
                st.push(newNode);
            }
            else{
                st.pop();
            }
        }
        return root;
    }

    public static void main(String args[])
    {
        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = construct(arr);
        display(root);
    }
}