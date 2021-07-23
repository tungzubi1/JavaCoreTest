package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
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
    public String readString()  {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhập chuỗi: ");
        s = sc.nextLine();

        return s;
    }

    public String upperCaseString (String s){
        char[] charArray = s.toCharArray();
        boolean check = true;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(check) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    check = false;
                }
            }
            else {
                check = true;
            }
        }
        s = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + s);
        return s;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        String s = task3.upperCaseString(task3.readString());
    }
}
