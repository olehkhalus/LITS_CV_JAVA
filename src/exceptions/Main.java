package exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        do1();
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
    }
    static void do1() {
        int[] intArray = new int[2];
        try {
            intArray[3]=8;
            System.out.println("4.0");
        } catch (Exception ex){
            System.out.println("exception occurs");
        } finally{
            System.out.println("What ever it takes!");
        }

        System.out.println("4.1");
        System.out.println("4.2");
        System.out.println("4.3");
        System.out.println("4.4");
    }
    static void doInCaseOfException(){

    }
}
