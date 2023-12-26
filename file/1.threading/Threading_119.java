import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Threading_119 {
  static Random rand = new Random();
  static BlockingQueue<Integer> evenQueue = new LinkedBlockingQueue<>();
  static BlockingQueue<Integer> oddQueue = new LinkedBlockingQueue<>();

  public static void main(String[] args) {
    new Thread(new NumberGenerator()).start();
    new Thread(new SquareCalculator()).start();
    new Thread(new CubeCalculator()).start();
  }
}

class NumberGenerator implements Runnable {
  @Override
  public void run() {
    while (true) {
      int number = Main.rand.nextInt();
      if (number % 2 == 0) {
        Main.evenQueue.add(number);
      } else {
        Main.oddQueue.add(number);
      }
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class SquareCalculator implements Runnable {
  @Override
  public void run() {
    while (true) {
      try {
        int number = Main.evenQueue.take();
        int result = number * number;
        System.out.println("Square: " + result);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class CubeCalculator implements Runnable {
  @Override
  public void run() {
    while (true) {
      try {
        int number = Main.oddQueue.take();
        int result = number * number * number;
        System.out.println("Cube: " + result);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
