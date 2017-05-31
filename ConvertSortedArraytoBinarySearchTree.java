
// Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class ConvertSortedArraytoBinarySearchTree {

	public static TreeNode insert(int[] nums, int low, int high) {
		if (low > high)
			return null;

		int mid = (low + high) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = insert(nums, low, mid - 1);
		node.right = insert(nums, mid + 1, high);

		return node;
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		int l = nums.length;
		if (l == 0)
			return null;

		TreeNode root = insert(nums, 0, l - 1);
		return root;
	}

	public static void main(String[] args) {

	}

}
