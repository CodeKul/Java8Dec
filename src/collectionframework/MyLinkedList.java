package collectionframework;

public class MyLinkedList {
    Node head;
    void add(int data){

        Node toAdd=new Node(data);

        if(head==null){
            head=toAdd;
        }
        else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
        }

    }

    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }


    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }


    }

}

class MyClass{
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(23);
        list.add(23);
        list.add(23);
        list.print();


    }




}


