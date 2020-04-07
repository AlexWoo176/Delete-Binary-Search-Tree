package codegym;

public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {

        return (this.root == null);
    }

    public BstNode getRoot() {
        return this.root;
    }

    public void insert(int data) {
        if(root == null) {
            this.root = new BstNode(data);
            return;
        }
        insertNode(this.root, data);
    }

    public BstNode insertNode(BstNode root, int data) {
        BstNode tmpNode = null;
        if(root.getValue() >= data) {
            if(root.getLeft() == null) {
                root.setLeft(new BstNode(data));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            if(root.getRight() == null) {
                root.setRight(new BstNode(data));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }
        return insertNode(tmpNode, data);
    }

    public boolean findNode(int data) {
        BstNode current = root;
        while (current !=null) {
            if (current.getValue() == data) {
                return true;
            } else if (current.getValue() > data) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public void delete(int data) {
        deleteNode(this.root, data);
    }

    public BstNode deleteNode(BstNode root, int data) {
        if(root == null) return root;

        if(data < root.getValue()) {
            root.setLeft(deleteNode(root.getLeft(), data));
        } else if(data > root.getValue()) {
            root.setRight(deleteNode(root.getRight(), data));
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

