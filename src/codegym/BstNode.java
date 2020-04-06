package codegym;

public class BstNode {
    private BstNode left;
    private BstNode right;
    private int value;

    public BstNode(int value) {
        this.value = value;
    }

    public BstNode getLeft() {
        return left;
    }

    public void setLeft(BstNode left) {
        this.left = left;
    }

    public BstNode getRight() {
        return right;
    }

    public void setRight(BstNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
