package sample.tree;
public class HeightofTree {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		BTreePrinter.printNode(root);
	System.out.println("Height of a Tree"+heightofTree(root));  
 
	//	BTreePrinter.printNode(root);
		
	}
	
	
	public static int heightofTree(TreeNode node){
		if(node==null){
			return 0;
		}
		
		int lh =  heightofTree(node.left);
		 int rh = heightofTree(node.right);
		 return (lh>rh)?lh+1: rh+1;
	}

}