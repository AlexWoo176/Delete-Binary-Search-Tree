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
        System.out.println("Check whether Node with value 45 exists : " + bin.findNode(45));
        bin.delete(100);
        System.out.println("In Order Traversal after delete Node 100: " );
        bin.inOrderTraversal();
        System.out.println();
        bin.delete(55);
        System.out.println("In Order Traversal after delete Node 55: ");
        bin.inOrderTraversal();
    }
}
