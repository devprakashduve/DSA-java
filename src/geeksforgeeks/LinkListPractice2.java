package geeksforgeeks;
/*
                  Head
                   |
      ---------------------------           -----------------------          --------------------
     |     data    | Reference   |--->>     | data    | Reference  |--->>    | data  | null     |+++++++++++++++++++++++++++++++++++++
      ---------------------------           -----------------------          --------------------
                   Node1                             Node2                          Node3

*/


public class LinkListPractice2 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String val){
            this.data=val;
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
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
}

public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
//        Node temp=head;
        head=head.next;
        p("element deleted successfully");
}
public void p(String val){
    System.out.println(val);
}
    public void p(int val){
        System.out.println(val);
    }
public void deleteLast(){
        if (head==null){
            p("Link list is empty");
            return;
        }
    Node secondlast=head;
        Node last=head.next;

        while(last.next!=null){
            secondlast=secondlast.next;
            last=last.next;
        }
        secondlast.next=null;

        p("last element deleted");

}
public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
}



    public static void main(String[] args) {
        LinkListPractice2 LL=new LinkListPractice2();

        LL.addFirst("w");
        LL.addFirst("v");
        LL.addFirst("u");
        LL.addLast("Z");
        LL.addFirst("T");
        LL.deleteFirst();
        LL.deleteFirst();
        LL.deleteLast();

        LL.printList();

    }
}