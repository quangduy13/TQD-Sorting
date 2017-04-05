import java.util.List;

public class Selection{
	public void selectionSort(List<Integer> list){
		int min;
		for (int i = 0; i < list.size(); i++) {
			min = i;
			
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(min)) {
					min = j;
				}
			}
			
			if (min != i) {
				int temp = list.get(i);
				list.set(i, list.get(min));
				list.set(min, temp);
			}
			System.out.println(list);
		}
	}
}
