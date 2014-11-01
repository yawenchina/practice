
/**
 * This is the class of MulitNode,it is  used to represent the relationship between
 * employee and the boss.
 *
 * @author Yawen Yu
 * @Time 11/1/2014
 *
 */

import java.util.*;

public class MulitNode {
	String name;
	String info;
	TreeMap<String,MulitNode> children;
    
	public void MulitNode(String name, String info) {
		this.name = name;
		this.info = info;
		this.children = new TreeMap<String,MulitNode>();
        
	}
    
	public void insert(MulitNode child) {
		if (this.children.size() == 0) {
			this.children.put(child.name+child.info,child);
		} else {
			String m = child.name+child.info;
			if(children.containsKey(m)){
				return ;
			}else{
				children.put(m,child);
			}
		}
        
	}
    
}
