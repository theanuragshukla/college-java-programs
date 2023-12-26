import java.util.*;

public class PrintS{

	public static void PrintS(int ind, ArrayList<Integer> list, int sum, int arr[], int n) {
		if (ind == n || sum==0) {
			if (sum==0) {
				System.out.println(list);
			}
			return;
		}
		int temp = arr[ind];
		list.add(temp);

		PrintS(++ind, new ArrayList<Integer>(list), sum-arr[ind], arr, n);
		System.out.println(ind-1);
		list.remove(list.size()-1);

		PrintS(ind, new ArrayList<Integer>(list),  sum, arr, n);
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 1};
		int n = 3;
		int sum = 2;
		ArrayList<Integer> list = new ArrayList<>();
		PrintS(0, list, sum, arr, n);
	}
}
