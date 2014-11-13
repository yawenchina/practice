public static void main(String args[]){
	String m = "aaaammmmddd";
	StringBuffer bu = new StringBuffer(m);
	recurtion(bu, 0, m.length()-1);
	System.out.print(bu.toString());

}
public static void recurtion(StringBuffer bu, int start, int end){
	if(start>= end){
		return ;
	}
	char temp = bu.charAt(start);
	bu.setCharAt(start, bu.charAt(end));
	bu.setCharAt(end, temp);

}