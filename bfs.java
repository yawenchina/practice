import java.util.*;
public class bfs {
	public static void main(String args[]){
		Node four = new Node(4);
		Node three = new Node(3);
		Node five = new Node(5);
		Node two = new Node(2);
		Node one = new Node(1);
		five.neighbors.add(four);
		five.neighbors.add(three);
		five.neighbors.add(one);
		one.neighbors.add(five);
		one.neighbors.add(three);
		one.neighbors.add(two);
		three.neighbors.add(one);
		three.neighbors.add(five);
		two.neighbors.add(one);
		four.neighbors.add(five);
		HashMap<Integer, Integer> map = calculateDegreeCount(one);
		System.out.print(map.get(3));
		System.out.print(map.get(1));
		System.out.print(map.get(2));
	}
	 private static HashMap<Integer, Integer> calculateDegreeCount(Node node) {
		      // YOUR CODE HERE! J! ~! q1 s# l$ ?" A( R
		        Queue<Node> bfsQ=new LinkedList<Node>();
		        HashSet<Node> visited=new HashSet<Node>();
		        HashMap<Integer,Integer> res=new HashMap<Integer,Integer>(); 
		        bfsQ.add(node);
		        visited.add(node);
		        while (!bfsQ.isEmpty()){
		            Node temp=bfsQ.remove();
		            int count=0;
		            for(Node neighbor:temp.neighbors){
		                count+=1;
		                if(!visited.contains(neighbor)){
		                    visited.add(neighbor);
		                    bfsQ.add(neighbor);
		                }
		            }
		            if (res.containsKey(count)){
		                int prevCount=res.get(count);
		                res.put(count,prevCount+1);
		            }else{
		                res.put(count,1);
		            }
		            
		        }
		        return res;
		    }
}
