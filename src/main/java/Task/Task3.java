package Task;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */

public class Task3 {
    public String readString() throws IOException {
        //write your code here
        Scanner sc = new Scanner(System.in);
                new InputStreamReader(System.in));

        System.out.println("Enter a String: ");
        return reader.readLine();
    }

    public String upperCaseString(String s) {
        //write your code here
        return Stream.of(s.trim().split("\\s"))
                .filter(word -> word.length() > 0)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws IOException {
        //write your code here
        Task3 task = new Task3();
        String str = task.readString();
        String result = task.upperCaseString(str);
        System.out.println("Result: " + result);
    }

}