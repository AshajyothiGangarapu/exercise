package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AsList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of students");
		int length = scanner.nextInt();
		String[] students = new String[length];
		System.out.println("enter names of students");
		for (int i = 0; i < length; i++) {
			String input = scanner.next();
			students[i] = input;

		}

		List<String> list = (Arrays.asList(students));
		Iterator<String> i=list.iterator();

		while(i.hasNext())
		{
		System.out.println(i.next()); 

		}
	}
}
