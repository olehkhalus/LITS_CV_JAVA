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
                System.out.println("Input your String ");
                String st1 = sc.nextLine();
                System.out.println(stringTasks.MaxOccurChar(st1));
                break;
            case ("two"):
                System.out.println("Input your String ");
                String st2 = sc.nextLine();
                System.out.println(stringTasks.reverseString(st2));
                break;
            case ("three"):
                System.out.println("Input your String ");
                String st3 = sc.nextLine();
                System.out.println(stringTasks.removeString(st3));
                break;
            case ("four"):
                System.out.println("Input your String ");
                String st4 = sc.nextLine();
                System.out.println(stringTasks.redBlue(st4));
                break;
            case ("five"):
                System.out.println("Input your String ");
                String st5 = sc.nextLine();
                System.out.println(stringTasks.repeatChar(st5));
                break;
            case ("six"):
                System.out.println("Input your String ");
                String st6 = sc.nextLine();
                System.out.println(stringTasks.sameChar(st6));
                break;
            default:
                System.out.println("Incorrect number of task;");
        }
    }
}
