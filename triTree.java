


public class TriTree {
	public class TriNode {
		int data ;
		TriNode left;
		TriNode right;
		TriNode mid;
		TriNode parent;
		public TriNode(int m){
			this.data = m;
			this.left = null;
			this.right= null;
			this.mid = null;

		}
	}
	TriNode root ;
	public TriTree(){
		root = null;
	}
	public TriTree(int m ){
		root = new TriNode(m);
	}
	 public TriNode insert(int data, TriNode node) {
		    if (node == null) {
		      node = new TriNode(data);
		    } else if (data < node.data) {
		      node.left = insert(data, node.left);
		    } else if (data == node.data) {
		      node.mid = insert(data, node.mid) ;
		    } else {
		      node.right = insert(data, node.right);
		    }
		    return node;
		  }
	 public void delete(int data, TriNode node) {
		    if(node == null){
		    	throw new IllegalArgumentException("node does not exist");
		    }
		    if(node.data < data){
		    	if(node.right == null){
		    		throw new IllegalArgumentException("value does not exist");
		    	}else{
		    		delete(data,node.right);
		    	}
		    }else if(node.data > data){
		    	if(node.left == null){
		    		throw new IllegalArgumentException("value does not exist");
		    	}else{
		    		delete(data,node.left);
		    	}
		    }else{
		    	if(node.mid != null){
		    		if(isLeaf(node.mid)){
		    		node.mid = null;
		    		return ;
		    		}else{
		    			delete(data,node.mid);
		    		}
		    		
		    	}else {
		    		
		    		if(node.right== null && node.left == null){
		    			System.out.print(node.data);
		    			node = null;
		    			////must change the parent value;
		    			System.out.print("dsfa");
		    			
		    		}else if(node.right == null){
		    			node = new TriNode(node.left.data);
		    		}else{
		    			node = new TriNode(node.left.data);
		    		}
		    	}
		    }
		  }
	 public static void main(String args[]){
		 TriTree m = new TriTree(5);
		 m.insert(4,m.root);
		 m.insert(5,m.root);
		 m.insert(7,m.root);
		 m.insert(9,m.root);
		 m.insert(2, m.root);
		 m.insert(2, m.root);
		 //print(m.root);
		 m.delete(9,m.root);
		 print(m.root);
		 
	 }
	 public static boolean isLeaf(TriNode m){
		 if(m == null){
			 return true;
		 }
		 if(m.left == null &&m.mid == null && m.right == null){
			 return true;
		 }
		 return false;
	 }
	 public static void print(TriNode m){
		 if(m == null){
			 return ;
		 }
		 System.out.print(m.data);
		 print(m.left);
		 print(m.mid);
		 print(m.right);
	 }
		 
}
