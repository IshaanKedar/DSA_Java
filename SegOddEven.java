class SegOddEven {
    Node head;
    Node tail;
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }
    
    //add
    public void addlast(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
        
    public void display() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.val + ">");
            currnode = currnode.next;
        }

    }
    
    public void segoddeven() {
        Node oddstart, oddend, evenstart, evenend;
        oddstart = oddend = evenstart = evenend = null;
        Node current = head;
        while (current != null) {
            if (current.val % 2 != 0) {
                if (oddstart == null) {
                    oddstart = current;
                    oddend = current;
                } else {
                    oddend.next = current;
                    oddend = current;
                }

            } else {
                if (evenstart == null) {
                    evenstart = current;
                    evenend = current;
                } else {
                    evenend.next = current;
                    evenend = current;
                }
            }
            current = current.next;
        }
        if (oddstart == null) {
            head = evenstart;
        } else {
            oddend.next = evenstart;
            head = oddstart;
        }
        evenend.next = null;
    }
    
    public static void main(String[] args) {
        SegOddEven list = new SegOddEven();
        list.addlast(1);
        list.addlast(7);
        list.addlast(6);
        list.addlast(8);
        list.addlast(9);
        list.addlast(2);
        list.display();
        System.out.println("");
        list.segoddeven();
        list.display();
    }
        
    }
