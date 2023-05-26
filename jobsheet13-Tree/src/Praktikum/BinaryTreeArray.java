package Praktikum;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        this.data = new int[10];
    }

    public void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    /**
     * Tugas No. 5
     * Menambahkan method add(int data) untuk memasukan data ke dalam tree
     * Menambahkan method traversePreOrder() dan traversePostOrder() dan  kita anggap nilai index awal yaitu 1
     * untuk mendapatkan nilai child left kita gunakan (2 * index)
     * untuk mendapatkan nilai child right kita gunakan (2 * index) + 1
     * menyamakan method tersebut dengan binary tree
     */
    public void add(int value) {
        if (idxLast == data.length - 1) {
            System.out.println("Tree is full. Cannot add more elements.");
            return;
        }

        idxLast++;
        data[idxLast] = value;
    }

    private void traversePreOrder(int index) {
        if (index <= idxLast) {
            System.out.print(data[index] + " ");
            traversePreOrder(2 * index);
            traversePreOrder(2 * index + 1);
        }
    }

    private void traversePostOrder(int index) {
        if (index <= idxLast) {
            traversePostOrder(2 * index);
            traversePostOrder(2 * index + 1);
            System.out.print(data[index] + " ");
        }
    }

}
