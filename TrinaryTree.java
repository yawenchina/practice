/**
 * This is the class of TriaryTree,it contains two method ,one is insert and the other is
 * delete.The structure of it is that there are  three child nodes for each parent
 * with the left node being values less than the parent, the right node
 * values greater than the parent, and the middle nodes values equal to the parent.
 *
 * @author Yawen Yu
 * @Time 10/24/2014
 *
 */

public class TrinaryTree{
	TreeNode root;
	TrinaryTree(){
		this.root = null;
	}
    
	/**
	 * insert a node which the value of it is key;
	 * @param int key
	 * @return void
	 */
	void insert(int key){
		TreeNode newNode = new TreeNode(key);
		if(this.root==null)
			this.root = newNode;
		else{
			TreeNode parent = null;
			TreeNode curnode = this.root;
			while(curnode != null){
				parent = curnode;
				if(curnode.key < key){
					curnode = curnode.right;
				}else if(curnode.key == key){
					curnode = curnode.mid;
				}else{
					curnode = curnode.left;
				}
			}
			if(parent.key < key){
				parent.right = newNode;
			}else if(parent.key == key){
				parent.mid = newNode;
			}else{
				parent.left = newNode;
			}
		}
	}
    
	/**
	 * Delete a node having the target keyue
	 * @param key the key of the node to delete
	 * @return true if succeed, false if fail
	 */
	boolean delete(int key){
		if(this.root==null)
			return false;
		TreeNode cur = this.root, parent = null;
		while(cur!=null){
			if(cur.key > key){
				parent = cur;
				cur = cur.left;
			}
			else if(cur.key < key){
				parent = cur;
				cur = cur.right;
			}
			else
				break;
		}
		if(cur==null)
			return false;
		
		if(cur.mid!=null){
			while(cur!=null){
				if(cur.mid==null){
					parent.mid=null;
					return true;
				}
				parent = cur;
				cur = cur.mid;
			}
		}
        
		if(cur==root)
			root = cur.right!=null ? cur.right : cur.left;
		else{
			if(parent.left==cur)
				parent.left = cur.right!=null ? cur.right : cur.left;
			else
				parent.right = cur.right!=null ? cur.right : cur.left;
		}
		if(cur.right!=null)
			leftMost(cur.right).left = cur.left;
		return true;
	}
	
	/**
	 * Return the most left node
	 * @param t is the TreeNode input
	 * @return TreeNode reference
	 */
	TreeNode leftMost(TreeNode t){
		while(t != null&& t.left!= null){
			t= t.left;
		}
		return t;
	}
}

class TreeNode {
	int key;
	TreeNode left, mid, right;
	TreeNode(int i){
		this.key = i;
		this.left = null;
		this.mid = null;
		this.right = null;
	}
}