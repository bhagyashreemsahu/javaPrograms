package Practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
	public static void main(String[] args) {

		int arr[] = {1,1,1,2,2,2,3,3,3,2,2,2,4,4,9,4,4,5,5,5,6,7,7,7,25,66,99,99,77};
		Map<Integer, Integer> map = new HashMap<>();

		for (int num:arr) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		map.forEach((key, value) -> {
			System.out.println("Number= " + key + "   Occurences= " + value);
		});

	}
}