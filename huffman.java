// Import all utility classes, including Scanner and PriorityQueue
import java.util.*;

// Node class represents each character or parent node in the Huffman tree
class Node {

    // Store the character
    char ch;

    // Store the frequency of the character
    int freq;

    // References to the left and right child nodes
    Node left, right;

    // Constructor to initialize a node with character and frequency
    Node(char ch, int freq) {

        // Assign the given character to the node
        this.ch = ch;

        // Assign the given frequency to the node
        this.freq = freq;

        // Initially, left and right child nodes are null
        left = right = null;
    }
}

// Main class
public class huffman {

    // Recursive method to print Huffman codes
    static void printCode(Node root, String code) {

        // Check if the current node is null
        if (root == null) {

            // Stop execution for this node
            return;
        }

        // Check whether the current node is a leaf node
        // A leaf node has no left and right children
        if (root.left == null && root.right == null) {

            // Print the character and its generated binary code
            System.out.println(root.ch + " : " + code);

            // Return after printing the leaf node's code
            return;
        }

        // Traverse the left subtree and add 0 to the code
        printCode(root.left, code + "0");

        // Traverse the right subtree and add 1 to the code
        printCode(root.right, code + "1");
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a PriorityQueue to store Huffman tree nodes
        // The node with the smallest frequency gets the highest priority
        PriorityQueue<Node> pq = new PriorityQueue<>(

            // Comparator used to arrange nodes in ascending order of frequency
            (a, b) -> a.freq - b.freq
        );

        // Ask the user to enter the number of characters
        System.out.print("Enter number of characters: ");

        // Read the number of characters
        int n = sc.nextInt();

        // Loop to accept each character and its frequency
        for (int i = 0; i < n; i++) {

            // Ask the user to enter a character
            System.out.print("Enter character: ");

            // Read the first character from the input
            char ch = sc.next().charAt(0);

            // Ask the user to enter its frequency
            System.out.print("Enter frequency: ");

            // Read the frequency
            int freq = sc.nextInt();

            // Create a new Node and insert it into the priority queue
            pq.add(new Node(ch, freq));
        }

        // Continue until only one node (root node) remains
        while (pq.size() > 1) {

            // Remove the node with the smallest frequency
            Node left = pq.poll();

            // Remove the node with the second smallest frequency
            Node right = pq.poll();

            // Create a new parent node
            // '-' represents an internal node, not an actual input character
            // Its frequency is the sum of the two selected nodes
            Node newNode = new Node(
                '-', left.freq + right.freq
            );

            // Assign the first removed node as the left child
            newNode.left = left;

            // Assign the second removed node as the right child
            newNode.right = right;

            // Insert the new parent node back into the priority queue
            pq.add(newNode);
        }

        // Remove the final remaining node
        // This node becomes the root of the Huffman tree
        Node root = pq.poll();

        // Display the heading
        System.out.println("\nHuffman Codes:");

        // Generate and print binary codes starting from the root
        // Initially, the code is an empty string
        printCode(root, "");

        // Close Scanner
        sc.close();
    }
}

// This program implements Huffman Coding using the Greedy Method.
//
// First, it reads each character and its frequency.
// It stores all nodes in a PriorityQueue.
// The node with the smallest frequency is selected first.
//
// It repeatedly removes the two nodes with the smallest frequencies.
// These two nodes are combined into a new parent node.
// The parent node stores the sum of their frequencies.
//
// This process continues until only one node remains.
// The final node becomes the root of the Huffman tree.
//
// During tree traversal:
// Left branch = 0
// Right branch = 1
//
// Each leaf node receives a unique binary Huffman code.
// Huffman Coding generates prefix-free codes and is used for data compression.
