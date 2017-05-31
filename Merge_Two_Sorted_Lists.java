
public class Merge_Two_Sorted_Lists {
	class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static Node mergeTwoList(Node l1, Node l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		Node l3;
		if (l1.val < l2.val) {
			l3 = l1;
			l3.next = mergeTwoList(l1.next, l2);
		} else {
			l3 = l2;
			l3.next = mergeTwoList(l1, l2.next);
		}
		return l3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
