package paymentInTransport;


import java.util.Objects;


public class Payment {
        private int year;
        private Month month;
        private int dayOfMonth;
        private double paymentSum;

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public Month getMonth() {
                return month;
        }

        public void setMonth(Month month) {
                this.month = month;
        }

        public int getDayOfMonth() {
                return dayOfMonth;
        }

        public void setDayOfMonth(int dayOfMonth) {
                this.dayOfMonth = dayOfMonth;
        }

        public double getPaymentSum() {
                return paymentSum;
        }

        public void setPaymentSum(double paymentSum) {
                this.paymentSum = paymentSum;
        }

        public Payment() {
        }

        public Payment(int year, Month month, int dayOfMonth, double paymentSum) {
                this.year = year;
                this.month = month;
                this.dayOfMonth = dayOfMonth;
                this.paymentSum = paymentSum;
        }

        @Override
        public String toString() {
                return "Payment{" +
                        "year=" + year +
                        ", month=" + month.getNumberOfMonth() +
                        ", dayOfMonth=" + dayOfMonth +
                        ", paymentSum=" + paymentSum +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Payment payment = (Payment) o;
                return year == payment.year &&
                        dayOfMonth == payment.dayOfMonth &&
                        Double.compare(payment.paymentSum, paymentSum) == 0 &&
                        month == payment.month;
        }

        @Override
        public int hashCode() {
                return Objects.hash(year, month, dayOfMonth, paymentSum);
        }

        public int dayInYear(int numberOfMonth, int numberOfDay) {
                int result = 0;
                //int[] staticDaysCount = new int [numberOfMonth];
                //int daysCounter = 0;
                //for(int i=0;i<staticDaysCount.length;i++){
               //         daysCounter += month.getDaysCount();
               //         staticDaysCount[i] = daysCounter;
              //  }
                switch(numberOfMonth){
                        case 1:
                                result = numberOfDay;
                                break;
                        case 2:
                                result = numberOfDay + /*staticDaysCount[0];*/ 31;
                                break;
                        case 3:
                                result = numberOfDay + /*staticDaysCount[1];*/ 59;
                                break;
                        case 4:
                                result = numberOfDay + /*staticDaysCount[2];*/ 90;
                                break;
                        case 5:
                                result = numberOfDay + /*staticDaysCount[3];*/ 120;
                                break;
                        case 6:
                                result = numberOfDay + /*staticDaysCount[4];*/ 151;
                                break;
                        case 7:
                                result = numberOfDay + /*staticDaysCount[5];*/ 181;
                                break;
                        case 8:
                                result = numberOfDay + /*staticDaysCount[6];*/ 212;
                                break;
                        case 9:
                                result = numberOfDay + /*staticDaysCount[7];*/ 243;
                                break;
                        case 10:
                                result = numberOfDay + /*staticDaysCount[8];*/ 273;
                                break;
                        case 11:
                                result = numberOfDay + /*staticDaysCount[9];*/ 304;
                                break;
                        case 12:
                                result = numberOfDay + /*staticDaysCount[10];*/ 334;
                                break;
                        default:
                                System.out.println("Incorrect number of month!");
                }
                return result;
        }

}
