package sample.assignment.tree;

public class MirrorTree {
	
	 TreeNode temp =null;
	
	 public TreeNode invertTree(TreeNode root) {
	        if(root==null){
				return null;
			}
			
		
		  
			
			if(root.left!=null && root.right!=null){
				temp = root.left;
				root.left=root.right;
				root.right=temp;		
			} else if(root.left==null && root.right!=null) {
				root.left = root.right;
				root.right = null;
			} else if(root.right==null && root.left!=null) {
				root.right= root.left;
				root.left=null;
			 }
	        
	        invertTree(root.left);
			invertTree(root.right);

			
			return root;
	        
	    }

}
