package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        int[] numbers = {14, 11, 5, 8, 23, 27, 150, 24, 22, 16, 15, 18};
        for (int x : numbers) {
            root.addRecursive(root, x);
        }

        root.dfs(root);
    }
}