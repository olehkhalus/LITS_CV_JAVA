package demo;

import java.time.LocalDate;
import java.util.Objects;

public class Record {
    private LocalDate yearMonth;
    private District region;
    private Integer count;

    public Record(LocalDate yearMonth, Integer count) {
        this.yearMonth = yearMonth;
        this.count = count;
    }

    public Record(){}

    public Record(LocalDate yearMonth, District region, Integer count) {
        this.yearMonth = yearMonth;
        this.region = region;
        this.count = count;
    }

    @Override
    public String toString() {
        return yearMonth + " " + region + " " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return yearMonth.equals(record.yearMonth) &&
                region == record.region &&
                count.equals(record.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearMonth, region, count);
    }

    public LocalDate getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(LocalDate yearMonth) {
        this.yearMonth = yearMonth;
    }

    public District getRegion() {
        return region;
    }

    public void setRegion(District region) {
        this.region = region;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
