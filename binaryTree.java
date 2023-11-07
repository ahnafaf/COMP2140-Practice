public class binaryTree {
    public static void main(String args[]) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5))

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

        public void insert(Node node)
        {
            root = insertHelper(root, node);

        }
        private Node insertHelper(Node root, Node node)
        {
            int data = node.data;
            if (root == null) {
                root = node;
                return root;
            } else if (data < root.data) {
                root.left = insertHelper(root.left, node);
            } else {
                root.right = insertHelper(root.right, node);
            }

            return root;
        }

        public void display()
        {

        }
        private void displayHelper()
        {

        }
        public boolean search(int data)
        {
            return false;
        }
        private boolean searchHelper(Node root, int data)
        {
            return false;
        }
        public void remove(int data) {
        }
        private void removeHelper(Node root, int data)
        {
            return;
        }

        private int successor(Node root)
        {
            return 0;
        }
    }
}