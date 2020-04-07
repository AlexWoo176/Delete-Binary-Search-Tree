package codegym;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {

        return (this.root == null);
    }

    public BstNode getRoot() {
        return this.root;
    }

    public void insert(int value) {
        if(root == null) {
            this.root = new BstNode(value);
            return;
        }
        insertNode(this.root, value);
    }

    public BstNode insertNode(BstNode root, int value) {
        BstNode tmpNode = null;
        if(root.getValue() >= value) {
            if(root.getLeft() == null) {
                root.setLeft(new BstNode(value));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            if(root.getRight() == null) {
                root.setRight(new BstNode(value));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, value);
    }

    public void delete(int value) {
        deleteNode(this.root, value);
    }

    public BstNode deleteNode(BstNode root, int value) {
        if(root == null) return root;

        if(value < root.getValue()) {
            root.setLeft(deleteNode(root.getLeft(), value));
        } else if(value > root.getValue()) {
            root.setRight(deleteNode(root.getRight(), value));
        } else {
            if(root.getLeft() == null && root.getRight() == null) {
                return null;
            } else if(root.getLeft() == null) {
                return root.getRight();
            } else if(root.getRight() == null) {
                return root.getLeft();
            } else {
                int minValue = minValue(root.getRight());
                root.setValue(minValue);
                root.setRight(deleteNode(root.getRight(), minValue));
            }
        }
        return root;
    }

    public int minValue(BstNode node) {

        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getValue();
    }

    public void inOrderTraversal() {
        doInOrder(this.root);
    }

    public void doInOrder(BstNode root) {

        if(root == null) return;
        doInOrder(root.getLeft());
        System.out.print(root.getValue()+" ");
        doInOrder(root.getRight());
    }
}

