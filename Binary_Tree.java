class Node {
	Node left, right;
	int val;

	Node(int val) {
		this.val = val;
		this.right = null;
		this.left = null;
	}

}

public class Binary_Tree {
	public Node root;

	Binary_Tree(int val) {
		this.root = new Node(val);
	}

	Binary_Tree(Node root) {
		this.root = root;
	}

	public void insert(int value, Node node) {
		if (value < node.val) {
			if (node.left != null) {
				insert(value, node.left);
			} else {
				node.left = new Node(value);
			}
		} else if (value > node.val) {
			if (node.right != null) {
				insert(value, node.right);
			} else {
				node.right = new Node(value);
			}
		}
	}

	public static Node minimumElement(Node root) {
		if (root.left == null)
			return root;
		else {
			return minimumElement(root.left);
		}
	}

	void deleteNode(int key, Node node) {
		if (key < node.val) {
			deleteNode(key, node.left);
		} else if (key > node.val) {
			deleteNode(key, node.right);
		}

		if (node.val == key) {
			// Both left and right Child
			if (node.left != null & node.right != null) {
				Node temp = node;
				Node minNode = minimumElement(temp.right);
				node.val = minNode.val;
				deleteNode(node.val, node.right);
			}
			// No child
			if (node.left == null & node.right == null) {
				node = null;
			}
			// Only left child
			else if (node.left != null) {
				node = node.left;
			}
			// Only right child
			else if (node.right != null) {
				node = node.right;
			}

		}
	}

	void printInorder(Node root) {
		if (root.left != null) {
			printInorder(root.left);
		}
		System.out.println(root.val);
		if (root.right != null) {
			printInorder(root.right);
		}
	}

	void printNode(Node temp) {
		System.out.println(temp.val);
	}

	public static void main(String[] args) {
		Node r1 = new Node(7);
		Binary_Tree bt1 = new Binary_Tree(r1);
		bt1.insert(4, r1);
		bt1.insert(10, r1);
		bt1.insert(8, r1);
		bt1.insert(12, r1);
		bt1.printInorder(r1);
		bt1.deleteNode(7, r1);
		bt1.printInorder(r1);

	}

}
