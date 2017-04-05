import java.util.List;

public class Buble {
	public void bubbleSort(List<Integer>list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, temp);
				}
				System.out.println(list);
			}
		}
	}
}
