import java.util.ArrayList;
import java.util.List;

public class Quick {
	List<Integer>list = new ArrayList<>();
	public void sort(List<Integer>list){
		this.list = list;
		quickSort(0, list.size()-1);
		System.out.println(list);
	}
	public void quickSort(int lowerIndex, int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		
		int pivot = list.get(lowerIndex + ((higherIndex - lowerIndex)/2));
		
		while(i <=j){
			
			while(list.get(i)<pivot){
				i++;
			}
			
			while(list.get(j)>pivot){
				j--;
			}
			
			if(i<=j){
				int temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
				i++;
				j--;
			}
		}
		if(lowerIndex <j){
			quickSort(lowerIndex, j);
		}
		if(i<higherIndex){
			quickSort(i,higherIndex);
		}
	}
}
