public class binaryTree {
    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(5));
        bst.insert(new Node(2));
        bst.insert(new Node(3));
        System.out.println("Attempting to print");
        bst.display();
    }
}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            root = node;
            return node;
        }

        if (node.data < root.data) {
            root.left = insertHelper(root.left, node);
        } else if (node.data > root.data) {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }
    public void display()
    {
        displayHelper(root);
    }
    private void displayHelper(Node root)
    {
        if(root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);

        } }
    public boolean search(int data)
    {

        return false; }
    private boolean searchHelper(Node root, int data)
    {

        return false;
    }

        public void remove(int data) {
    }

    private void removeHelper(Node root, int data)
    {     return;
    }

    private int successor(Node root)
    {
        return 0;
    }
}