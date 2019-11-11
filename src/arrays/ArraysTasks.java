package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTasks {
    Scanner scan = new Scanner(System.in);

    public void numberOfTask(){
        System.out.println("1. sum values of an array.");
        System.out.println("2. test if an array contains a specific value.");
        System.out.println("3. find the index of an array element.");
        System.out.println("4. insert an element (specific position) into an array.");
        System.out.println("5. find the duplicate values of an array of integer values.");
        System.out.println("6. remove duplicate elements from an array.");
        System.out.println("7. find the second smallest element in an array.");
        System.out.println("8. test the equality of two arrays.");
        System.out.println("9. get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.");
        System.out.println("10. check if an array of integers without 0 and -1.");
        
        System.out.println("Input number of task: ");
        String numberOfTask = scan.nextLine();
        switch (numberOfTask){
            case ("1"):
                System.out.println("Sum of all elements of array is: " + arrSum(arrayInitializeOne()));
                break;
            case ("2"):
                System.out.println(specificValue(arrayInitializeOne()));
                break;
            case ("3"):
                indexFound(arrayInitializeOne());
                break;
            case ("4"):
                System.out.println("New array: " + Arrays.toString(insertIntoArray(arrayInitializeOne())));
                break;
            case ("5"):
                System.out.println(findDuplicate(arrayInitializeOne()));
                break;
            case ("6"):
                removeDuplicate(arrayInitializeOne());
                break;
            case ("7"):
                secondSmallest(arrayInitializeOne());
                break;
            case ("8"):
                System.out.println(equality(arrayInitializeOne(),arrayInitializeTwo()));
                break;
            case("9"):
                System.out.println("Difference between the largest and smallest elements of array is: " + largeAndSmall(arrayInitializeOne()));
                break;
            case("10"):
                checkZero(arrayInitializeOne());
                break;
            default:
                System.out.println("Invalid number of task!");

        }
    }


    public int[] arrayInitializeOne(){
        System.out.println("Input length of arrays: ");
        int length = scan.nextInt();
       int[] arrOne = new int[length];
        for(int i=0;i<arrOne.length;i++){
            System.out.println("Input element of arrays №" + (i+1));
            arrOne[i] = scan.nextInt();
        }
        return arrOne;
    }

    public int[] arrayInitializeTwo(){
        System.out.println("Input length of arrays: ");
        int length = scan.nextInt();
        int [] arrTwo = new int[length];
        for(int i=0;i<arrTwo.length;i++){
            System.out.println("Input element of arrays №" + (i+1));
            arrTwo[i] = scan.nextInt();
        }
        return arrTwo;
    }


    public int arrSum(int[] args){
        int sum = 0;
            for(int i=0;i<args.length;i++){
                sum+=args[i];
            }
        return sum;
    }


    public String specificValue(int[] args){
        System.out.println("Input specific value: ");
        int specValue = scan.nextInt();
        for(int i=0; i<args.length; i++){
            if(args[i]!=specValue){
                continue;
            }else{
                return "Array contain specific value " + args[i] + " at position " + i;
            }
        }
    return "There is no specific value";
    }


    public void indexFound(int[] args){
        System.out.println("Input index of value: ");
        int index = scan.nextInt();
        System.out.println(Arrays.toString(args));
        System.out.println("Value with index " + index + " is " + args[index]);
    }


    public int[] insertIntoArray(int[] args){
        System.out.println("Input value what you want to insert into array: ");
        int newElement = scan.nextInt();
        System.out.println("Input in what index you want to insert new value: ");
        int newIndex = scan.nextInt();
        System.out.println("Old array: " + Arrays.toString(args));
        args[newIndex] = newElement;
        return args;
    }


    public String findDuplicate(int[] args){
        for(int i=0;i<args.length; i++){
            for(int j=i+1; j<args.length;j++){
                if (args[j]==args[i]){
                    return "There are duplicate in array - " + args[j] + ", at position " + i + " and " + j;
                }

                }
            }
        return "No duplicates!";
        }


        public void removeDuplicate(int[] args){
            for (int i=0; i<args.length; i++){
                for(int j=i+1; j< args.length; j++){
                    if(args[i]==args[j]){
                        args[j] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(args));
        }


        public void secondSmallest(int[] args){
        int smallest = args[0];
        for(int i=1; i< args.length; i++){
            if(args[i]<smallest){
                smallest=args[i];
            }
        }
        int secondSmallest = args[1];
        for(int i=2; i< args.length; i++){
            if(args[i]<secondSmallest && args[i]>smallest){
                secondSmallest=args[i];
            }
        }
            System.out.println(Arrays.toString(args));
            System.out.println("Second smallest element in array is: " + secondSmallest);
        }


        public String equality(int[] argsOne,int[] argsTwo){
        int arrEquals = 0;
            if(argsOne.length != argsTwo.length){
                return "Arrays have different length";
            }
            if (argsOne.length == argsTwo.length){
                for(int i=0; i<argsOne.length; i++){
                    if(argsOne[i]==argsTwo[i]){
                     arrEquals++;
                    }
                }
            }
            if(arrEquals==argsOne.length){
                return "Arrays are the same!";
            }
            else
                return "Arrays are different!";
        }


        public int largeAndSmall(int[] args){
        int large = args[0];
        int small = args[1];
            for(int i=0; i<args.length; i++){
                if(args[i]>large){
                    large = args[i];
                }else if(args[i]<small){
                    small = args[i];
                }
            }
            return large-small;
        }

        public void checkZero(int[] args){
        int arrZeroClear = 0;
        int arrOneClear = 0;
        for(int i=0; i<args.length; i++){
            switch (args[i]){
                case 0:
                    arrZeroClear++;
                    System.out.println("Array has \"0\" at position with index: " + i);
                    break;
                case -1:
                    arrOneClear++;
                    System.out.println("Array has \"-1\" at position with index: " + i);
                    break;
                default: //do something
            }
        }
        if(arrOneClear==0 && arrZeroClear==0){
            System.out.println("Array don`t have \"0\" and \"-1\" ");
        }
        }

}
