
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    int l = 2 * n - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {

        int val = 0;
        if (i < n) {
          if (j >= i && j < l - 1 - i) {
            val = n - i;
          } else {
            if (j < n) {
              val = n - j;
            } else {
              val = n - (l - 1 - j);
            }
          }
          System.out.print(val + " ");
        } else {

          if (j <= i && j >= l - 1 - i) {
            val = i - n + 2;
          } else {
            if (j < n) {
              val = n - j;
            } else {

              val = n - (l - 1 - j);
            }
          }
          System.out.print(val + " ");
        }
      }
      System.out.println();
    }
  }
}

