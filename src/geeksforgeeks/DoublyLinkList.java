package geeksforgeeks;

public class DoublyLinkList {
    Node head;
    class Node{


        String data;
        Node prev;
        Node next;
        Node(String val){
            this.data=val;
            this.prev=null;
            this.next=null;
        }
    }
    public void addFirst(String val){
        Node newNode=new Node(val);
        if (head==null){
            head=newNode;
            return;
            }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String val){
        Node newNode=new Node(val);
        if (head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        newNode.prev=temp;
        temp.next=newNode;
    }

    public void printList(){
        if (head==null){
            System.out.println("list is empty");
        }
        Node curNode=head;
        while (curNode!=null){
            System.out.println(curNode.data);
            curNode=curNode.next;

        }

    }

    public static void main(String[] args) {

        DoublyLinkList DLL=new DoublyLinkList();
        DLL.addFirst("A");
        DLL.addFirst("B");
        DLL.addLast("test");
        DLL.printList();
    }
}
