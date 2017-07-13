package Excercise4;

import java.util.*;

public class GetEnumerationOverArrayList {
	public static void main(String[] args) {
		ArrayList<String> names_list = new ArrayList<String>();
		names_list.add("asha");
		names_list.add("jyothi");
		Collection<String> col = names_list;
	    Enumeration<String> e = Collections.enumeration(col);
	    
	    for (; e.hasMoreElements();) {
	      Object o = e.nextElement();
	      System.out.println(o);
	    }
	  }
	}


