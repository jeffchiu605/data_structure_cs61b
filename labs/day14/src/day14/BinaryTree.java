package day14;
import java.util.*;

public class BinaryTree {

	protected TreeNode myRoot;
	
	public BinaryTree ( ) {
		myRoot = null;
	}
	
	public BinaryTree (TreeNode t) {
		myRoot = t;
	}
	
	// Print the values in the tree in preorder: root value first,
	// then values in the left subtree (in preorder), then values
	// in the right subtree (in preorder).
	public void printPreorder ( ) {
		printPreorder (myRoot);
		System.out.println ( );
	}

	protected static void printPreorder (TreeNode t) {
		if (t != null) {
			System.out.print (t.myItem + " ");
			printPreorder (t.myLeft);
			printPreorder (t.myRight);
		}
	}

	// Print the values in the tree in inorder: values in the left
	// subtree first (in inorder), then the root value, then values
	// in the right subtree (in inorder).
	public void printInorder ( ) {
		printInorder (myRoot);
		System.out.println ( );
	}

	protected static void printInorder (TreeNode t) {
		if (t != null) {
			printInorder (t.myLeft);
			System.out.print (t.myItem + " ");
			printInorder (t.myRight);
		}
	}
	
	public void fillSampleTree1 ( ) {
		myRoot =
		    new TreeNode ("a",
			new TreeNode ("b"),
			new TreeNode ("c"));
	}

	public void fillSampleTree2 ( ) {
		myRoot =
		    new TreeNode ("a",
			new TreeNode ("b",
			    new TreeNode ("d",
				new TreeNode ("e"),
				new TreeNode ("f")),
			    null),
			new TreeNode ("c"));
	}

	public static void main (String [ ] args) {
		BinaryTree t;
		t = new BinaryTree ( );
		print (t, "the empty tree");
		t.fillSampleTree1 ( );
		print (t, "sample tree 1");
		t.fillSampleTree2 ( );
		print (t, "sample tree 2");
	}

	protected static void print (BinaryTree t, String description) {
		System.out.println (description + " in preorder");
		t.printPreorder ( );
		System.out.println (description + " in inorder");
		t.printInorder ( );
		System.out.println ( );
	}

	protected static class TreeNode {
		
		protected Object myItem;
		protected TreeNode myLeft;
		protected TreeNode myRight;
		
		public TreeNode (Object obj) {
			myItem = obj;
			myLeft = myRight = null;
		}
		
		public TreeNode (Object obj, TreeNode left, TreeNode right) {
			myItem = obj;
			myLeft = left;
			myRight = right;
		}
	}
	private class InorderIterator implements Iterator {
		  private Stack<TreeNode> nodeStack;
		  private TreeNode currentNode;
		  
		  public InorderIterator ( ) {
		    nodeStack = new Stack<TreeNode> ( );
		    currentNode = myRoot;
		  } // end default constructor
		  
		  public boolean hasNext ( ) {
		    return !nodeStack.isEmpty() || (currentNode != null);
		  } // end hasNext
		  
		  public Object next ( ) {
		    TreeNode nextNode = null;
		    
		    // find leftmost node with no left child
		    while (currentNode != null) {
		      nodeStack.push(currentNode);
		      currentNode = currentNode.myLeft;
		    } // end while
		    
		    // get leftmost node, then move to its right subtree
		    if (!nodeStack.isEmpty ( )) {
		      nextNode = nodeStack.pop();
		      assert nextNode != null; // since nodeStack was not empty
		                               // before the pop
		      currentNode = nextNode.myRight;
		    } else {
		      throw new NoSuchElementException();
		    }
		    return nextNode.myItem; 
		  } // end next
		  
		  public void remove ( ) {
		    throw new UnsupportedOperationException();
		  } // end remove
		} // end InorderIterator
}
