package collection;

import java.util.ArrayList;
import java.util.Collections;


public class Simple {
	public static void main(String[] args) {
		ArrayList<Excercise2> studentList = new ArrayList<Excercise2>();

		studentList.add(new Excercise2("asha", 75));
		studentList.add(new Excercise2("asha1", 45));
		studentList.add(new Excercise2("asha2", 55));
		studentList.add(new Excercise2("asha3", 58));
		studentList.add(new Excercise2("asha4", 99));
		studentList.add(new Excercise2("asha5", 82));
		studentList.add(new Excercise2("asha6", 84));
		studentList.add(new Excercise2("asha7", 93));
		studentList.add(new Excercise2("asha8", 96));
		studentList.add(new Excercise2("asha9", 78));
		Collections.sort(studentList, new MarksComparator());
		
		System.out.println(studentList.get(0));
		System.out.println(studentList.get(9));

	}
}
