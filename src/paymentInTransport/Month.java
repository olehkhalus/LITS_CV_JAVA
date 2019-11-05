package paymentInTransport;

public enum Month {
    JANUARY(1,"Січень",31),
    FEBRUARY(2,"Лютий",28),
    MARCH(3,"Березень", 31),
    APRIL(4,"Квітень", 30),
    MAY(5,"Травень",31),
    JUNE(6,"Червень",30),
    JULY(7,"Липень",31),
    AUGUST(8,"Серпень",31),
    SEPTEMBER(9,"Вересень", 30),
    OCTOBER(10,"Жовтень", 31),
    NOVEMBER(11,"Листопад", 30),
    DECEMBER(12,"Грудень",31);

    private int numberOfMonth;
    private String name;
    private int daysCount;

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }
    Month(){}

    Month(int numberOfMonth, String name, int daysCount) {
        this.numberOfMonth = numberOfMonth;
        this.name = name;
        this.daysCount = daysCount;
    }
}
