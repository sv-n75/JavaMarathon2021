package day18;

public class Node {
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public static Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else  {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }

    public void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(" " + node.value);
            dfs(node.right);
        }
    }
}

