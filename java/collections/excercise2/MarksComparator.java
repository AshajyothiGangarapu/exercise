package collection;

import java.util.Comparator;

public class MarksComparator implements Comparator<Excercise2> {

	public int compare(Excercise2 o1, Excercise2 o2) {
		if (o1.marks == o2.marks)
			return 0;
		else if (o1.marks > o2.marks)
			return 1;
		else
			return -1;
	}

}
