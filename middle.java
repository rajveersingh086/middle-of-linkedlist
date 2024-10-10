package geeks.linkedlist;

class Node{
    int data;
    Node next;
    Node (int x){
        data = x;
        next = null;
    }
}
public class middle {
    Node head;
    void printMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("the middle element is"+ slow.data);
    }
    public void push (int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList(){
        Node tnode = head ;
        while (tnode != null){
            System.out.println(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        middle list = new middle();
        for (int i = 5;i>0;i--){
            list.push(i);
            list.printList();
            list.printMiddle(list.head);
        }
    }
}
