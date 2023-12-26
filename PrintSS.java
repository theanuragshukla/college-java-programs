import java.util.ArrayList;
import java.util.List;

public class PrintSS {

  public static void printS(int[] arr, int sum, int i,
                                     List<Integer> list) {
    if (sum == 0) {
		System.out.println(list);
      return;
    }
    if (i == arr.length) {
      return;
    }
    list.add(arr[i]);
    printS(arr, sum - arr[i], i + 1, list);
    list.remove(list.size() - 1);
    printS(arr, sum, i + 1, list);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
    int sum = 2;

    List<Integer> list = new ArrayList<>();

    printS(arr, sum, 0, list);
  }
}
