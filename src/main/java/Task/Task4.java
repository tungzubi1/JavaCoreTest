package Task;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args) {
        //write your code here
        Task4 task = new Task4();
        List<Integer> list = task.getIntegerList();
        int n = task.getMinimum(list);
        System.out.println("Minimum nunber is: " + n);
    }

    public int getMinimum(List<Integer> array) {
        // write your code here
        int min;
        min = Collections.min(array);
        return min;
    }

    public List<Integer> getIntegerList() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + " : ");
            int num = scanner.nextInt();
            list.add(num);
        }
        return list;
    }
}