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
				// Write your code here.
		List<Integer> sums = new ArrayList<Integer>();
		listBranchSums(root,0, sums);
		return sums;
	}


	private static void listBranchSums(BinaryTree root,int numSum, List<Integer> sums) {
		// TODO Auto-generated method stub
		if(root ==null)
			return;
		
		numSum += root.value;
		if(root.left==null&&root.right==null) {
			sums.add(numSum); 
			return;
		}
		
		
		listBranchSums(root.left,numSum,sums);
		listBranchSums(root.right,numSum,sums);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTree first 
	}

}
