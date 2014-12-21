TreeNode post = null;
public TreeNode findNode(int target, TreeNode root){
	if(root == null){
		return post;
}
if(root.val <= target){
	return findNode(target, root.right);
	
}else{
	post = root;
	return findNode(target, root.left);
	
}

}
