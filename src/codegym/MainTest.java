package codegym;

public class MainTest {
    public static void main(String[] args) {
        BinarySearchTree bin = new BinarySearchTree();
        bin.insert(60);
        bin.insert(55);
        bin.insert(100);
        bin.insert(45);
        bin.insert(57);
        bin.insert(67);
        bin.insert(107);
        bin.insert(59);
        bin.insert(101);

        System.out.println("-------------------");
        System.out.println("In Order Traversal");
        bin.inOrderTraversal();
        System.out.println();
        bin.delete(101);
        bin.inOrderTraversal();
        System.out.println();
        bin.delete(59);
        bin.inOrderTraversal();
    }
}
