package strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringTasks stringTasks = new StringTasks();
        Scanner sc = new Scanner(System.in);

        System.out.println(" one - find maximum occuring character in string;");
        System.out.println(" two - reverse words in given string;");
        System.out.println(" three - remote (b) and (ac) from a given string;");
        System.out.println(" four - check chars before and after #;");
        System.out.println(" five - Red and Blue task;");
        System.out.println(" six - repeat every char twice in the original string;");
        System.out.println("Input number of task: (one/two/three/four/five/six) ");
        String task = sc.nextLine();
        switch (task) {
            case ("one"):
                System.out.println("Write a Java program to find the maximum occurring character in a string");
                System.out.println();
                System.out.println("Input your String ");
                String str = sc.nextLine();
                System.out.println("Maximum occuring character in a string is: " + stringTasks.MaxOccurChar(str));
                break;
            case ("two"):
                System.out.println(" Write a Java program to reverse words in a given string");
                System.out.println();
                System.out.println("Input your String ");
                str = sc.nextLine();
                System.out.println("Reverse words in a given string is: " + stringTasks.reverseString(str));
                break;
            case ("three"):
                System.out.println("Write a Java program to remove \"b\" and \"ac\" from a given string.");
                System.out.println();
                System.out.println("Input your String ");
                 str = sc.nextLine();
                System.out.println("New string without \"b\" and \"ac\" is: " + stringTasks.removeString(str));
                break;
            case ("four"):
                System.out.println("Write a Java program to check whether the character immediately before and after of # is same in a given string. ");
                System.out.println();
                System.out.println("Input your String ");
                str = sc.nextLine();
                System.out.println("Are the characters immediately befor and after of \"#\"? " + stringTasks.sameChar(str));
                break;
            case ("five"):
                System.out.println("Write a Java program to check whether the string 'red' and 'blue' appear in same number of times in a given string");
                System.out.println();
                System.out.println("Input your String ");
                str = sc.nextLine();
                System.out.println("String \"red\" and \"blue\" appear in same number of times: " + stringTasks.redBlue(str));
                break;
            case ("six"):
                System.out.println(" Write a Java program to repeat every character twice in the original string.");
                System.out.println();
                System.out.println("Input your String ");
                str = sc.nextLine();
                System.out.println("New string with all repeated characters is: " + stringTasks.repeatChar(str));
                break;
            default:
                System.out.println("Incorrect number of task;");
        }
    }
}
