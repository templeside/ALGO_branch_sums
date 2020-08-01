import java.util.*;

class Program {
	// This is the class of the input root. Do not edit it.
	public static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public static List<Integer> branchSums(BinaryTree root) {
		// Write your code here.
		if(root.left==null) {
			return 
		}
		root.value;
		branchSums(root.left);
		branchSums(root.right);

		return new ArrayList<Integer>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
