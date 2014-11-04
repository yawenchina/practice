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
import java.io.*;
public class parseD {
	public static void main(String args[]) throws IOException {
		// Scanner in = new Scanner(System.in);
		// String input = in.next();
		// String input1 =
		// "Fred,Karl,Technician,2010--Karl,Cathy,VP,2009--Cathy,NULL,CEO,2007--Adam,Karl,Technician,2010--Bob,Karl,Technician,2012--Cathy,Karl,Technician,2013--Karl,Nancy,Manager,2009--Wendy,Nancy,Technician,2012--Nancy,NULL,CEO,2007--Fred,Cathy,Technician,2010--Nancy,Wendy,Technician,2013--Vince,Karl,VP,2009--Bob,Susan,Manager,2010--Adam,Susan,Technician,2011--Ned,Wendy,Technician,2009--Liam,Wendy,Technician,2007--Dan,Ryan,Director,2008--Carl,Susan,Technician,2010--Ed,Wendy,Technician,2007--Patty,Wendy,Technician,2008--Tom,Susan,Technician,2011--Sam,Susan,Technician,2008--Lilly,Jack,Manager,2007--Amy,Jill,Technician,2012--Wendy,Dan,Manager,2010--Cathy,Vince,Director,2006--Susan,Vince,Director,2009--Betty,Cathy,Manager,2012--Oscar,Betty,Technician,2006--Jill,Dan,Manager,2012--Katie,Jill,Technician,2007--Paul,Bob,Technician,2007--Ryan,Karl,VP,2007--Mary,Lilly,Technician,2013--Matt,Jill,Technician,2007--Karl,NULL,CEO,2005--Jack,Ryan,Director,2009";
		/*String input1 = "Fred,Karl,Technician,2010--Karl,Cathy,VP,2009--Cathy,NULL,CEO,2007";
         String input2 = "Adam,Karl,Technician,2010--Bob,Karl,Technician,2012--Cathy,Karl,Technician,2013--Karl,Nancy,Manager,2009--Wendy,Nancy,Technician,2012--Nancy,NULL,CEO,2007";
         
         String input3 = "Fred,Cathy,Technician,2010--Nancy,Wendy,Technician,2013--Vince,Karl,VP,2009--Bob,Susan,Manager,2010--Adam,Susan,Technician,2011--Ned,Wendy,Technician,2009--Liam,Wendy,Technician,2007--Dan,Ryan,Director,2008--Carl,Susan,Technician,2010--Ed,Wendy,Technician,2007--Patty,Wendy,Technician,2008--Tom,Susan,Technician,2011--Sam,Susan,Technician,2008--Lilly,Jack,Manager,2007--Amy,Jill,Technician,2012--Wendy,Dan,Manager,2010--Cathy,Vince,Director,2006--Susan,Vince,Director,2009--Betty,Cathy,Manager,2012--Oscar,Betty,Technician,2006--Jill,Dan,Manager,2012--Katie,Jill,Technician,2007--Paul,Bob,Technician,2007--Ryan,Karl,VP,2007--Mary,Lilly,Technician,2013--Matt,Jill,Technician,2007--Karl,NULL,CEO,2005--Jack,Ryan,Director,2009";
         */
		BufferedReader rd = new BufferedReader(new FileReader("/Users/yawen/Desktop/org_chart_sample.in"));
		String m = rd.readLine();
		String str = null;
		while ((str = rd.readLine()) != null) {
			parseHelper(str);
		}
        //Scanner in = new Scanner(System.in);
        //String m = in.nextLine();
        //while(in.hasNext()){
        //parseHelper(in.nextLine()); }
        
		
		/*parseHelper(input1);
         parseHelper(input2);
         parseHelper(input3);*/
        
	}
    
	static int i = 1;
    
	/**
	 * print a node
	 *
	 * @param MulitNode
	 *            root, int level
	 * @return void
	 */
    
	public static void Print(HashMap<String, TreeMap<String, String>> map,
                             String boss, int level) {
		if (!map.containsKey(boss)) {
			return;
		} else if (level > 0) {
			
			TreeMap<String, String> temp = map.get(boss);
            
			for (Map.Entry m : temp.entrySet()) {
				int i = 0;
				//System.out.print("+");
				while (i < level) {
					i++;
					System.out.print("-");
				}
				System.out.print(m.getKey()+" ");
				System.out.print(m.getValue());
				System.out.println();
				Print(map, (String) m.getKey(), level + 1);
			}
            
		} else if (boss == "NULL") {
			System.out.print("Case"+" ");
			System.out.print("#"+i++);
			System.out.println();
			TreeMap<String, String> temp = map.get(boss);
			for (Map.Entry<String, String> m : temp.entrySet()) {
				System.out.print(m.getKey()+" ");
				System.out.print(m.getValue());
				System.out.println();
				Print(map, (String) m.getKey(), 1);
			}
			
		}
        
	}
    
	public static void parseHelper(String input) {
		// change the input into an array of String and split by "--"
		String[] m = input.split("--");
		//MulitNode root = new MulitNode("NULL", "this is root");
		//root.children = new TreeMap<String, MulitNode>();
		int i = 0;
		HashMap<String, TreeMap<String, String>> map = new HashMap<String, TreeMap<String, String>>();
        
		for (String nn : m) {
			String[] array = nn.split(",");
			if (!map.containsKey(array[1])) {
				String info = "(" + array[2] + ") " + array[3];
				TreeMap<String, String> tree = new TreeMap<String, String>();
				tree.put(array[0], info);
				map.put(array[1], tree);
			} else {
				TreeMap<String, String> t = map.get(array[1]);
				String info = "(" + array[2] + ") " + array[3];
				t.put(array[0], info);
				map.put(array[1], t);
			}
            
		}
		Print(map, "NULL", 0);
		// use dfs recursion way to solve this problem
        
	}
    
}
