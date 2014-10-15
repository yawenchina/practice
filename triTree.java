class triTree {
  int key;
  triTree left;
  triTree middle;
  triTree right;
 
  public triTree(int key) {
    this.key = key;
    this.left = this.middle = this.right = null;
  }
 
}
 
 
class TrinaryTree {
  triTree root;
 
//Construct an empty TrinaryTree at first
  public TrinaryTree() {
    root = null;
  }
 
//...other less relevant functions
 
/*General method that inserts a key.  Starts by being called at a node, then travels down
 *until it finds the right place to create a node with that key.
 */
  public triTree insert(key, node) {
    if (node == null) {
      node = new triTree(key);
    } else if (key < node.key) {
      node.left = insert(key, node.left);
    } else if (key == node.key) {
      node.middle = insert(key, node.middle) ;
    } else {
      node.right = insert(key, node.right);
    }
    return node;
  }
 
/*Helper function for deletion.  When you delete a key with children,
 *you want to make sure that it's replaced with either itself or its successor,
 *which is the minimum of the right subtree.
 */
  public triTree findMin(node) {
    if (node != null) {
      while (node.left != null) {
        return findMin(node.left);
      }
    } 
    return node;
  }
 
/*General method that deletes a node.  Starts at a node, then travels down until it replaces
 *a node with either itself (the middle child), its successor (the minimum of the right
 *subtree, or its left child (which can be null), in that order.
 */
  public triTree delete(key, node) {
    if (node == null) {
      throw new RuntimeException();
    } else if (key < node.key) {
      node.left = delete(key, node.left);
    } else if (key > node.key) {
      node.right = delete(key, node.right);
    } else {
      if (node.middle != null) {
        node.middle = delete(key, node.middle);
      } else if (node.right != null) {
        node.key = findMin(node.right).key;
        node.right = delete(findMin(node.right).key, node.right);
      } else {
        node = node.left;
      }
    }
    return node;
  }  
  public static void main(String args[]){
	  triTree root = new triTree(5);
	  root.insert(4,root);
	  root.insert(5,root);
	  root.insert(9,root);
	  root.insert(2,root);
	  root.insert(2,root);
	  root.insert(7,root);
	  System.out.print(root.key);
	  
  }
    
}