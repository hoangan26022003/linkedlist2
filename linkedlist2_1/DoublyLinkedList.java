package linkedlist2_1;

public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (size == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(newNode);
            newNode.setPrevious(lastNode);
            size++;
        }
    }

    public void add(int data, int position) {
        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else if (position < 0 || position > size) {
            throw new RuntimeException("Vi tri khong hop le!");
        } else {
            Node previousNode = head;
            for (int i = 0; i < position - 1; i++) {
                previousNode = previousNode.getNext();
            }
            Node currentNode = previousNode.getNext();

            Node newNode = new Node(data);

            newNode.setPrevious(previousNode);
            previousNode.setNext(newNode);

            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);

            size++;
        }
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong! Khong the xoa.");
            return;
        }
        if (size == 1) {
            head = null;
        } else {
            Node secondNode = head.getNext();
            secondNode.setPrevious(null);
            head = secondNode;
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong! Khong the xoa.");
            return;
        }
        if (size == 1) {
            head = null;
        } else {
            Node lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            Node secondLastNode = lastNode.getPrevious();
            secondLastNode.setNext(null);
        }
        size--;
    }

    public void removeAt(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Vi tri khong hop le! Khong the xoa.");
            return;
        }
        if (position == 0) {
            removeFirst();
        } else if (position == size - 1) {
            removeLast();
        } else {
            Node currentNode = head;
            for (int i = 0; i < position; i++) {
                currentNode = currentNode.getNext();
            }
            Node previousNode = currentNode.getPrevious();
            Node nextNode = currentNode.getNext();
            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
            size--;
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Danh sach lien ket rong!");
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp + " <=> ");
            tmp = tmp.getNext();
        }
        System.out.println("NULL");
    }
}
