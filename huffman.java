
import java.util.*;

class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left = right = null;
    }
}

public class huffman {

    static void printCode(Node root, String code) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
            return;
        }

        printCode(root.left, code + "0");
        printCode(root.right, code + "1");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> a.freq - b.freq
        );

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter character: ");
            char ch = sc.next().charAt(0);

            System.out.print("Enter frequency: ");
            int freq = sc.nextInt();

            pq.add(new Node(ch, freq));
        }

        while (pq.size() > 1) {

            Node left = pq.poll();
            Node right = pq.poll();

            Node newNode = new Node(
                '-', left.freq + right.freq
            );

            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        Node root = pq.poll();

        System.out.println("\nHuffman Codes:");

        printCode(root, "");
        
        sc.close();
    }
}

//It reads each character and its frequency.
// It stores them in a priority queue so the smallest frequency node is always selected first.
// It repeatedly combines the two lowest-frequency nodes into a new parent node.
// The parent node stores the sum of both frequencies.
// This process continues until only one tree remains.
// While traversing the tree, left branch = 0 and right branch = 1.
// Each leaf node gets a binary code.
// In short, Huffman coding uses the cheapest (least frequent) symbols first to build an optimal prefix code for compression.