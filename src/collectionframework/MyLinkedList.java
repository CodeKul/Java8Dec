package collectionframework;


class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class MyLinkedList {
    Node head;

    void add(int data){
        Node toAdd=new Node(data);

        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }


    boolean isEmpty(){
        if(head==null){
            return true;
        }
        else {
            return false;
        }
    }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(23);
        list.add(23);
        list.add(23);
        list.print();
    }
}
