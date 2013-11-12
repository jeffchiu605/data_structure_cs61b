package day14;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import java.util.*;

public class BinaryTreeTest extends TestCase{

	
	public void testPreorder() {
		ArrayList <Object> preorder = new ArrayList<Object>();
		preorder.add("A");
		preorder.add("B");
		preorder.add("C");
		preorder.add("D");
		preorder.add("E");
		preorder.add("F");
		
		assertTrue(preorder.myItem == "A");
		assertTrue(preorder.myLeft == "B");
		assertTrue(preorder.myRight == "C");
		assertTrue(preorder.myRight.myLeft == "D");
		assertTrue(preorder.myRight.myLeft.myLeft == "E");
		assertTrue(preorder.myRight.myLeft.myRight == "F");
	}
	public void testInorder() {
		ArrayList <Object> Inorder = new ArrayList<Object>();
		Inorder.add("B");
		Inorder.add("A");
		Inorder.add("E");
		Inorder.add("D");
		Inorder.add("F");
		Inorder.add("C");
		
		assertTrue(Inorder.myItem == "A");
		assertTrue(Inorder.myLeft == "B");
		assertTrue(Inorder.myRight == "C");
		assertTrue(Inorder.myRight.myLeft == "D");
		assertTrue(Inorder.myRight.myLeft.myLeft == "E");
		assertTrue(Inorder.myRight.myLeft.myRight == "F");

	}

}
