package Task;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * 1. Use the keyboard to enter the number N.
 *
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 *
 * 3. Find the minimum among the list items: the getMinimum method.
 *
 /* Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        //write your code here
        Task4 test = new Task4();
        List<Integer> list = test.getIntegerList();
        System.out.println("Input list: " + list);
        System.out.println("Minimum value in list: " + test.getMinimum(list));
    }

    public int getMinimum(List<Integer> array) {
        // write your code here
        return array.stream().mapToInt(n -> n).min().orElseThrow(NoSuchElementException::new);
    }

    public List<Integer> getIntegerList() throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int numLines = Integer.parseInt(reader.readLine());

        System.out.println("Enter " + numLines + " line by line: ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numLines; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        return numbers;
    }
}
