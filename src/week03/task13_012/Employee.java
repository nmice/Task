package week03.task13_012;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private final String name;
    private final String address;
    private final LocalDate date;
    //private final int[] data;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        String result = String.format("%1$-30s %2$-20s %3$-20s", name, address, date.getMonthValue() + "." + date.getYear());
        return result;//name + "|\t\t" + address + "|\t\t" + Arrays.toString(data);
    }

    //public Employee(String name, String address, int[] data) {
    public Employee(String name, String address, LocalDate data) {
        this.name = name;
        this.address = address;
        this.date = data;
    }

    public int getExperience() {
        //int month = this.data[0];
        //int year = this.data[1];
        //Calendar calendar = Calendar.getInstance();
        //int Month = calendar.get(Calendar.MONTH);
        //int Year = calendar.get(Calendar.YEAR);
        //int experience = Month >= month ? Year - year : Year - year - 1;
        LocalDate today = LocalDate.now();
        Period period = date.until(today);
        int experience = period.getYears();
        return experience;
    }
}
