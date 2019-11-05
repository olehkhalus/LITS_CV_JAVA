package paymentInTransport;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[3];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < payments.length; i++) {
            payments[i] = new Payment();

            System.out.println("Input year of payment №" + (i + 1));
            payments[i].setYear(scan.nextInt());

            System.out.println("Input month of payment №" + (i + 1));
            int codeOfMonth = scan.nextInt();

            switch (codeOfMonth) {
                case 1:
                    payments[i].setMonth(Month.JANUARY);
                    break;
                case 2:
                    payments[i].setMonth(Month.FEBRUARY);
                    break;
                case 3:
                    payments[i].setMonth(Month.MARCH);
                    break;
                case 4:
                    payments[i].setMonth(Month.APRIL);
                    break;
                case 5:
                    payments[i].setMonth(Month.MAY);
                    break;
                case 6:
                    payments[i].setMonth(Month.JUNE);
                    break;
                case 7:
                    payments[i].setMonth(Month.JULY);
                    break;
                case 8:
                    payments[i].setMonth(Month.AUGUST);
                    break;
                case 9:
                    payments[i].setMonth(Month.SEPTEMBER);
                    break;
                case 10:
                    payments[i].setMonth(Month.OCTOBER);
                    break;
                case 11:
                    payments[i].setMonth(Month.NOVEMBER);
                    break;
                case 12:
                    payments[i].setMonth(Month.DECEMBER);
                    break;
                default:
                    System.out.println("Incorrect number of month");


            }

            System.out.println("Input day in month of payment №" + (i+1));
            payments[i].setDayOfMonth(scan.nextInt());

            System.out.println("Input PaymentSum in this day of payment №" + (i+1));
            payments[i].setPaymentSum(scan.nextInt());

        }


        System.out.println("Input number of task, that you want to know: ");
        System.out.println(" \"1\" - Total sum of all payments:");
        System.out.println(" \"2\" - If all payments were in the same year?: ");
        System.out.println(" \"3\" - Month, when were most payments: ");
        System.out.println(" \"4\" - Number of days after first and before last payments: ");
        int methodNumber = scan.nextInt();
        switch (methodNumber){
            case 1:
                double totalSum = 0;
                for(int i=0;i<payments.length; i++){
                    totalSum +=payments[i].getPaymentSum();
                }
                System.out.println("Total sum of all payments: " + totalSum);
                break;
            case 2:
                int yearExample = payments[0].getYear();
                int countTrue = 0;
                for(int i=1;i<payments.length;i++) {
                    if(yearExample == payments[i].getYear()) {
                        countTrue++;
                    }
                }
                    if(countTrue==payments.length-1){
                        System.out.println("All payment were in the same year!");
                    }else
                        System.out.println("All payments were not in the same year!");
                break;
            case 3:
                final int MONTH_SIZE = 12;
                int[] count = new int [MONTH_SIZE];

                for(int i=0;i<payments.length;i++){
                        count[payments[i].getMonth().getNumberOfMonth()]++;
                }

                int max = -1;
                String result = "";
                for (int i=0; i<payments.length;i++){
                    if(max < count[payments[i].getMonth().getNumberOfMonth()]){
                        max = count[payments[i].getMonth().getNumberOfMonth()];
                        result = payments[i].getMonth().getName();
                    }

                }
                System.out.println("Month, when were most payments: " + result);
                break;
            case 4:
                int afterAndBefore ;
                int[] paymentDayInYear = new int [payments.length];
                for (int i=0; i<payments.length;i++){
                   paymentDayInYear[i] = payments[i].dayInYear(payments[i].getMonth().getNumberOfMonth(),payments[i].getDayOfMonth());
                }
                afterAndBefore = paymentDayInYear[payments.length-1] - paymentDayInYear[0];
                System.out.println("Number of days after first and before last payment: " + afterAndBefore);
                break;
            default:
                System.out.println("Incorrect number of method");
        }

    }

}

