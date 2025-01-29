package linked_list;

class LinkedList {
    Node head;
    private int size;

    LinkedList(){
        this.size = 0;
    }
    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }


    //add - first,last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + ">");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }
    
    //delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;

        }
        size--;
        head = head.next;
    }

    //delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;

        }
        size--;
        if (head.next == null) {
            head = null;
            return;

        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }


    public int getsize() {
        return size;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("list");
        list.printlist();
        list.addFirst("this");
        list.printlist();

        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        System.out.println(list.getsize());
    }
}