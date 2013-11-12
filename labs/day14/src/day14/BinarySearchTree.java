package day14;


public class BinarySearchTree extends BinaryTree{
	
	public boolean contains (Comparable a) {
		if (myRoot == null) {
			return false; 
		}
		TreeNode Nod = (TreeNode)a;
		int temp = (myRoot.myItem).compareTo(Nod.myItem);
		if (temp == 0) {
			return true;
		}
		else if (temp < 0){
			return contains((Comparable) Nod.myRight);
		}
		else {
			return contains((Comparable) Nod.myLeft);
		}
	}
	public void add (Comparable a) {
		
	}
}
