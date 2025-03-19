package cat2;

/*Collect Left Boundary Nodes: Collects all nodes from the root’s left child, excluding leaf nodes, until a leaf is reached.
Collect Leaf Nodes: Using recursion traverse the tree and collect all leaf nodes in the result.
Collect Right Boundary Nodes: Collects all nodes from the root’s right child, excluding leaf nodes, in reverse order. */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class bound_trav_tree {

    static boolean isleaf(Node node) {
        return node.left == null && node.right == null;

    }
    //collect left nodes

    static void collectleft(Node root, ArrayList<Integer> res) {
        if (root == null || isleaf(root))
            return;

        res.add(root.data);
        if (root.left != null)
            collectleft(root.left, res);
        else if (root.right != null)
            collectleft(root.right, res);

    }
    
    static void collectleaves(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;
        if (isleaf(root)) {
            res.add(root.data);
            return;
        }

        collectleaves(root.left, res);
        collectleaves(root.right, res);

    }
    
    static void collectright(Node root, ArrayList<Integer> res) {
        if (root == null || isleaf(root))
            return;
        if (root.right != null)
            collectright(root.right, res);
        else if (root.left != null)
            collectright(root.left, res);
        res.add(root.data);
    }

    static ArrayList<Integer> bound_trav(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        if (!isleaf(root))
            res.add(root.data);

        collectleft(root.left, res);
        collectleaves(root, res);
        collectright(root.right, res);

        return res;
    }
    public static Node buildTree(Scanner scanner) {
        System.out.println("Enter root node value: ");
        int rootValue = scanner.nextInt();
        if (rootValue == -1) return null; // No tree

        Node root = new Node(rootValue);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println("Enter left child of " + current.data + " (-1 for no child): ");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) {
                current.left = new Node(leftValue);
                queue.add(current.left);
            }

            System.out.println("Enter right child of " + current.data + " (-1 for no child): ");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) {
                current.right = new Node(rightValue);
                queue.add(current.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Node root = buildTree(scanner);
        scanner.close();

        ArrayList<Integer> boundary = bound_trav(root);

        for (int x : boundary)
            System.out.print(x + " ");
    }
}