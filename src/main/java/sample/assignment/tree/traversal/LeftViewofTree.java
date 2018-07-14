package sample.assignment.tree.traversal;

import sample.assignment.tree.BTreePrinter;
import sample.assignment.tree.TreeNode;

public class LeftViewofTree {
	static int  max_level = 0;
	public static void main(String[] argument){
	System.out.println("Inside the main");
	System.out.println("Inside main");
	TreeNode root = new TreeNode(140);
	root.left = new TreeNode(30);
	root.right = new TreeNode(30);
	root.left.left = new TreeNode(5);
	root.left.left.left = new TreeNode(15);
	root.left.right = new TreeNode(5);
	root.right.left = new TreeNode(60);
	root.right.right = new TreeNode(7);
	BTreePrinter.printNode(root);
	leftView(root);

	}
	
	
	public static void leftView(TreeNode root){
		
		 leftViewUtility(root,1);
	}
	
	
public static void leftViewUtility(TreeNode root, int level){
	
	if(root==null){
		return ;
	}
	
	if(max_level<level){
		System.out.print(root.val);
		max_level=level;
	}
	leftViewUtility(root.left,level+1);
	leftViewUtility(root.right,level+1);
	return;
	
	
		
		
	}

}