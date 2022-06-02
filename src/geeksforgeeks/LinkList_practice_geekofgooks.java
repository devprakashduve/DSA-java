package geeksforgeeks;

import java.util.*;


/*
                  Head
                   |
      ---------------------------           -----------------------          --------------------
     |     data    | Reference   |--->>     | data    | Reference  |--->>    | data  | null     |+++++++++++++++++++++++++++++++++++++
      ---------------------------           -----------------------          --------------------
                   Node1                             Node2                          Node3

*/
public class LinkList_practice_geekofgooks {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

    }
// add data
    //2 way add first add last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add in last
    public void addLast(String data){
        Node newNode=new Node(data);
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
    // print list items

    public void printList(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+"->"+currNode.next);
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
// delete items

    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;

    }

    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        if (head.next==null){
            head=null;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;

        }
        secondLast.next=null;
    }
    public static void main(String[] args) {
        LinkList_practice_geekofgooks list=new LinkList_practice_geekofgooks();


        list.addLast("is");
        list.addFirst("This");
        list.printList();
        list.addLast("List");
        list.addLast("example");

        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.deleteLast();
        list.printList();

        LinkedList<String> libList=new LinkedList<String>();
        libList.addFirst("X ");
        libList.addFirst("this ");
        libList.addFirst("is ");
        System.out.println(libList);
    }

    // builtin LinkList libs and uses




}
