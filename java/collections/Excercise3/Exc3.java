package Excercise3;

import java.util.ArrayList;
import java.util.Vector;

public class Exc3 {
	public static void main(String[] args) {
		ArrayList<String> names_list = new ArrayList<String>();
		names_list.add("asha");
		names_list.add("jyothi");
		names_list.add("reddy");
		names_list.add("gangarapu");
		Vector<String> newNamesList = new Vector<String>();
		newNamesList.add("ishrath");
		newNamesList.add("irfana");
		newNamesList.add("mahammad");
		names_list.addAll(1,newNamesList);
		for(String st:names_list){
			System.out.println(st);
		}
		
		
		
	}

}
