import java.util.*;
public class joinString {
		 /*main function used for test, the result of it is abbcde*/
		  public static void main(String args[]) {
		    String[] m = { "abbc", "bb", "bcd", "cde" };
		    joinString join = new joinString();
		    System.out.print(join.joinWords(m));
		  }
		/*
	 	This funtion is used to getInput ,return the final String with shortest length;
	    @param String[] words : array of input string
		@return String : shortest length String
	    */
		  public String joinWords(String[] words) {
		    String[] res = new String[1];
		    res[0] = null;
		    words = removeSubStrings(words);
		    boolean[] checked = new boolean[words.length];
		    joinWordsHelper(words, "", res, 0, checked);
		    return res[0];
		  }

		  private String[] removeSubStrings(String[] words) {
		    Set<String> subs = new HashSet<String>();
		    for (int i = 0; i < words.length; i++) {
		      for (int j = 0; j < words.length; j++) {
		        if (i != j && words[i].contains(words[j])) {
		          subs.add(words[j]);
		        }
		      }
		    }
		    List<String> result = new ArrayList<String>();
		    for (String word : words) {
		      if (!subs.contains(word)) {
		        result.add(word);
		      }
		    }
		    return result.toArray(new String[0]);
		  }
		  /*
		   *  use recurstion function to get the shortest String;
	    		@param String[]       words : input of the String
	    		@param String[]       res : the result set
	    		@param StringBuffer   bu : temporary data structure to store the result
	    		@param boolean[]      checked: use to check if this word is been used
	    		@param int            index:use index as a sign to show the step of dfs.
		   */
		  public void joinWordsHelper(String[] words, String bu, String[] res, int index, boolean[] checked) {
		    if (index == words.length) {
		      if (res[0] == null || bu.length() < res[0].length() || bu.length() == res[0].length()
		          && bu.compareTo(res[0]) < 0) {
		        res[0] = new String(bu);
		      }
		      return;
		    }
		    for (int i = 0; i < words.length; i++) {
		      if (!checked[i]) {
		        checked[i] = true;
		        int len = bu.length();
		        int lcur = words[i].length();
		        int maxMatch = 0;
		        for (int j = Math.max(0, len - lcur); j < len; j++) {
		          if (bu.substring(j).equals(words[i].substring(0, len - j))) {
		            maxMatch = len - j;
		          }
		        }
		        joinWordsHelper(words, bu + words[i].substring(maxMatch), res, index + 1, checked);
		        checked[i] = false;
		      }
		    }
		  }

}
