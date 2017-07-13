package collection;

import java.util.*;

public class Exercise1 {
	public static void main(String args[]) {

		List<String> names = Arrays.asList("Larry", "Moe", "Curly", "123");
		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}
}
