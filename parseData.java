/**
 * This is the class of parseData,it contains two method :
 * one finds if the parent node which represent the boss of
 * the employee is in the tree.
 * the other is used to use dfs method to print the tree structure of the whole
 * company.
 *
 * @author Yawen Yu
 * @Time 11/1/2014
 *
 */
import java.util.*;

public class parseData {
	public static void main(String args[]) {
		// Scanner in = new Scanner(System.in);
		// String input = in.next();
		//String input1 = "Fred,Karl,Technician,2010--Karl,Cathy,VP,2009--Cathy,NULL,CEO,2007--Adam,Karl,Technician,2010--Bob,Karl,Technician,2012--Cathy,Karl,Technician,2013--Karl,Nancy,Manager,2009--Wendy,Nancy,Technician,2012--Nancy,NULL,CEO,2007--Fred,Cathy,Technician,2010--Nancy,Wendy,Technician,2013--Vince,Karl,VP,2009--Bob,Susan,Manager,2010--Adam,Susan,Technician,2011--Ned,Wendy,Technician,2009--Liam,Wendy,Technician,2007--Dan,Ryan,Director,2008--Carl,Susan,Technician,2010--Ed,Wendy,Technician,2007--Patty,Wendy,Technician,2008--Tom,Susan,Technician,2011--Sam,Susan,Technician,2008--Lilly,Jack,Manager,2007--Amy,Jill,Technician,2012--Wendy,Dan,Manager,2010--Cathy,Vince,Director,2006--Susan,Vince,Director,2009--Betty,Cathy,Manager,2012--Oscar,Betty,Technician,2006--Jill,Dan,Manager,2012--Katie,Jill,Technician,2007--Paul,Bob,Technician,2007--Ryan,Karl,VP,2007--Mary,Lilly,Technician,2013--Matt,Jill,Technician,2007--Karl,NULL,CEO,2005--Jack,Ryan,Director,2009";
        //String input1 = "Fred,Karl,Technician,2010--Karl,Cathy,VP,2009--Cathy,NULL,CEO,2007";
		//String  input2 = "Adam,Karl,Technician,2010--Bob,Karl,Technician,2012--Cathy,Karl,Technician,2013--Karl,Nancy,Manager,2009--Wendy,Nancy,Technician,2012--Nancy,NULL,CEO,2007";
        //String input3 = "Fred,Cathy,Technician,2010--Nancy,Wendy,Technician,2013--Vince,Karl,VP,2009--Bob,Susan,Manager,2010--Adam,Susan,Technician,2011--Ned,Wendy,Technician,2009--Liam,Wendy,Technician,2007--Dan,Ryan,Director,2008--Carl,Susan,Technician,2010--Ed,Wendy,Technician,2007--Patty,Wendy,Technician,2008--Tom,Susan,Technician,2011--Sam,Susan,Technician,2008--Lilly,Jack,Manager,2007--Amy,Jill,Technician,2012--Wendy,Dan,Manager,2010--Cathy,Vince,Director,2006--Susan,Vince,Director,2009--Betty,Cathy,Manager,2012--Oscar,Betty,Technician,2006--Jill,Dan,Manager,2012--Katie,Jill,Technician,2007--Paul,Bob,Technician,2007--Ryan,Karl,VP,2007--Mary,Lilly,Technician,2013--Matt,Jill,Technician,2007--Karl,NULL,CEO,2005--Jack,Ryan,Director,2009";
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
		 	parseHelper(in.nextLine());
        }
		
		//parseHelper(input1);
		//parseHelper(input2);
		//parseHelper(input3);
        
	}
    
	static int i = 1;
	/**
	 * dfs print a node
	 * @param MulitNode root, int level
	 * @return void
	 */
    
	public static void dfsPrint(MulitNode root, int level) {
        
		if (level > 1) {
			int i = 1;
			while (i < level) {
				i++;
				System.out.print("-");
			}
			System.out.print(root.name);
			System.out.print(root.info);
			System.out.println("");
            
		} else if (level == 1) {
			System.out.print("Case#");
			System.out.print(i++);
			System.out.println("");
			System.out.print(root.name);
			System.out.print(root.info);
			System.out.println("");
		}
		for (MulitNode child : root.children.values()) {
			dfsPrint(child, level + 1);
            
		}
	}
	public static void parseHelper(String input){
        // change the input into an array of String and split by "--"
		String[] m = input.split("--");
		MulitNode root = new MulitNode();
		root.name = "NULL";
		root.info = "this is the root";
		root.children = new TreeMap<String, MulitNode>();
		int i = 0;
		while (i < 5) {
			for (String nn : m) {
				String[] array = nn.split(",");
				if (find(root, array[1]) != null) {
					MulitNode parent = find(root, array[1]);
					String info = "(" + array[2] + ")" + array[3];
					MulitNode leaf = new MulitNode();
					leaf.name = array[0];
					leaf.info = info;
					leaf.children =new TreeMap<String, MulitNode>();
					parent.insert(leaf);
                    
				}
			}
			i++;
		}
		// use dfs recursion way to solve this problem
		dfsPrint(root, 0);
	}
	/**
	 * find if the string is already in the tree
	 * @param MulitNode root, String m
	 * @return void
	 */
    
	
	public static MulitNode find(MulitNode root, String m) {
		Queue<MulitNode> q = new LinkedList<MulitNode>();
		q.add(root);
		while (!q.isEmpty()) {
			MulitNode node = q.poll();
			if (node.name.equals(m)) {
				return node;
			}
			for (MulitNode temp : node.children.values()) {
				q.offer(temp);
			}
		}
		return null;
        
	}
    
}
