import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public List<Integer> nhap() {//nhap list phan tu khoi tao ban dau
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Number of elements: ");
		
		int n = in.nextInt(); //so phan tu cua list
		
		for(int i = 0 ; i < n; i++){
			System.out.print("Number "+(i+1)+": "); // nhap tung phan tu vao list
			int num = in.nextInt();
			list.add(num);
		}
		
		return list;
	}
}
