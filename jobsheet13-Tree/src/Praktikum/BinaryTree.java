package Praktikum;

public class BinaryTree {
    Node root;
    int size;

    public BinaryTree() {
        this.root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
        }

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null){
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null){
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }

        }
    }

    /**
     * Tugas No. 1
     * add method add Recursive untuk dapat menambah nilai di binary dengan cara recursive
     */
    public void addRecursive(Node current, int data) {
        if (data < current.data) {
            if (current.left == null) {
                current.left = new Node(data);
            } else {
                addRecursive(current.left, data);
            }
        } else if (data > current.data) {
            if (current.right == null) {
                current.right = new Node(data);
            } else {
                addRecursive(current.right, data);
            }
        }
    }
    /**
     * Tugas No. 2
     * add method findMinValue and findMaxValue kedua method ini digunakan untuk mencari nilai paling kiri(paling kecil) atau digunakan untuk mencari nilai paling kanan(paling besar)
     */
    public int findMinValue() throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty.");
        }
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMaxValue() throws Exception {
        if (root == null) {
            throw new Exception("Tree is empty.");
        }
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    /**
     * Tugas No. 3
     * add method showLeafNodes yang menerima input berupa nilai root method ini digunakan untuk menampilkan nilai dari daun atau ujung node
     * jika nilai tersebut kosong maka binary tree masih kosong
     * jika node left dan node right kosong maka tampilkan data tersebut
     * kemudian kita panggil lagi menggunakan recursive tiap cabang node kiri maupun kanan
     */
    public void showLeafNodes(Node node) {
        if (node == null) {
            System.out.println("Binary tree masih kosong!");
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        showLeafNodes(node.left);
        showLeafNodes(node.right);
    }

    /**
     * Tugas No. 4
     * add method countLeafNodes yang menerima input berupa nilai root method ini digunakan untuk menghitung leaf atau ujung daun dari suatu node
     * jika nilai tersebut kosong maka binary tree akan mengembalikan nilai 0
     * jika node left dan node right kosong maka akan mengembalikan nilai 1
     * kemudian kita akan manampung nilai left node dan right nodes dan mengupdate nilai nodes keduanya
     * setelah itu kita jumlahkan daun kiri dan kanan;
     */
    public int countLeafNodes(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);
        return leftCount + rightCount;
    }


}
