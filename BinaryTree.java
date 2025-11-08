public class BinaryTree {
    // The starting point of our tree.
    Node root;

    public void traversePreOrder() {
        System.out.println("\n--- Pre-Order Traversal (Root -> Left -> Right) ---");
        // Start the real traversal from the root node
        traversePreorderRecursive(root);
        System.out.println(); // Add a new line for clean output
    }

    private void traversePreorderRecursive(Node node) {
        if (node == null) {
            return; // Stop if we've reached an empty spot (a null child).
        }

        // 1. Visit the root
        System.out.print(node.data + " -> ");
        // 2. Recursively traverse the left subtree
        traversePreorderRecursive(node.left);
        // 3. Recursively traverse the right subtree
        traversePreorderRecursive(node.right);
    }

    public void traverseInOrder() {
        System.out.println("\n--- In-Order Traversal (Left -> Root -> Right) ---");
        // Start the real traversal from the root node
        traverseInorderRecursive(root);
        System.out.println(); // Add a new line for clean output
    }

    private void traverseInorderRecursive(Node node) {
        if (node == null) {
            return; // Stop if we've reached an empty spot (a null child).
        }

        // 1. Recursively traverse the left subtree
        traverseInorderRecursive(node.left);
        // 2. Visit the root
        System.out.print(node.data + " -> ");
        // 3. Recursively traverse the right subtree
        traverseInorderRecursive(node.right);
    }

    public void traversePostOrder() {
        System.out.println("\n--- Post-Order Traversal (Left -> Right -> Root) ---");
        // Start the real traversal from the root node
        traversePostorderRecursive(root);
        System.out.println(); // Add a new line for clean output
    }

    private void traversePostorderRecursive(Node node) {
        if (node == null) {
            return; // Stop if we've reached an empty spot (a null child).
        }

        // 1. Recursively traverse the left subtree
        traversePostorderRecursive(node.left);
        // 2. Recursively traverse the right subtree
        traversePostorderRecursive(node.right);
        // 3. Visit the root
        System.out.print(node.data + " -> ");
    }
}