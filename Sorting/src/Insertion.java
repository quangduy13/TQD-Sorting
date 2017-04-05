import java.util.List;

public class Insertion{
	public void insertionSort(List<Integer> list){
		int value;
		int position;
		for (int i = 1; i < list.size(); i++) {
			value = list.get(i);
			position = i;
			while (position > 0 && value < list.get(position - 1)) {
				int temp = list.get(position - 1);
				list.set(position - 1, value);
				list.set(position, temp);
				position--;
				System.out.println(list);
			}
		}
		
	}
}
