package linkedlist2_1;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();

        myList.addLast(10);
        myList.addLast(20);
        myList.addLast(30);
        myList.addLast(35);

        System.out.println("Danh sach ban dau:");
        myList.display();

        myList.addFirst(50);
        System.out.println("Them 50 vao dau danh sach:");
        myList.display();

        myList.add(40, 3);
        System.out.println("Them 40 vao vi tri 4:");
        myList.display();

        myList.removeFirst();
        System.out.println("Xoa phan tu dau tien:");
        myList.display();

        myList.removeLast();
        System.out.println("Xoa phan tu cuoi cung:");
        myList.display();

        myList.removeAt(3);
        System.out.println("Xoa phan tu o vi tri 3:");
        myList.display();
    }
}
