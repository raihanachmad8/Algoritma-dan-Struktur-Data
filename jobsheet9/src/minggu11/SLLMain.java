package minggu11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700,999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1=" + singLL.getData(1));
        System.out.println("Data 3 berada pad indeks ke-" + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();

        System.out.println("Tugas");
        System.out.println("Implementasi 4 macam penambahana data");

        SingleLinkedList myLIst = new SingleLinkedList();
        myLIst.print();
        myLIst.addFirst(5);
        System.out.println("Add First : 5");
        myLIst.print();
        myLIst.addLast(2);
        System.out.println("Add Last : 2");
        myLIst.print();
        myLIst.insertBefore(2,9);
        System.out.println("Add Before : 2 9");
        myLIst.print();
        System.out.println("Add After : 9 43");
        myLIst.insertAfter(9, 43);
        myLIst.print();

    }
}
