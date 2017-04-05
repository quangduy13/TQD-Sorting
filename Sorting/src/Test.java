import java.util.List;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list;
		Input input = new Input();
		list = input.nhap();

		System.out.println("Choose one sorting algorithm:");
		System.out.println("1. Insertion Sort");
		System.out.println("2. Selection Sort");
		System.out.println("3. Bubble Sort");
		System.out.println("4. Quick Sort");
		System.out.print("You will choose: ");
		int choose;
		Scanner in = new Scanner(System.in);
		choose = in.nextInt();

		System.out.print("List before sort: ");
		System.out.println(list);
		switch (choose) {
		case 1:
			Insertion insert = new Insertion();
			insert.insertionSort(list);
			break;
		case 2:
			Selection select = new Selection();
			select.selectionSort(list);
			break;
		case 3:
			Buble bubble = new Buble();
			bubble.bubbleSort(list);
			break;
		case 4:
			break;

		}
	}

}
