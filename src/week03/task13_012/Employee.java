package week03.task13_012;

import java.util.Arrays;
import java.util.Calendar;

public class Employee {
    private final String name;
    private final String address;
    private final int[] data;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int[] getData() {
        return data;
    }

    @Override
    public String toString() {
        String result = String.format("%1$-30s %2$-20s %3$-20s", name, address, Arrays.toString(data));
        return result;//name + "|\t\t" + address + "|\t\t" + Arrays.toString(data);
    }

    public Employee(String name, String address, int[] data) {
        this.name = name;
        this.address = address;
        this.data = data;
    }

    public int getExperience() {
        int month = this.data[0];
        int year = this.data[1];
        Calendar calendar = Calendar.getInstance();
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);
        int experience = Month >= month ? Year - year : Year - year - 1;
        return experience;
    }
}
