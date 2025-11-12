class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    
    void insertBeg(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void print(){
        Node temp = head;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        head=temp;
    }
}
class SinglyLinkedListDef{
    public static void main (String[] args) {
        LinkedList L1=new LinkedList();
        L1.insertBeg(10);
        L1.insertBeg(20);
        L1.print();
    }
}
