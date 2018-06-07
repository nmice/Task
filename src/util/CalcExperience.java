package util;

import java.util.Calendar;

public class CalcExperience{
    public static int calcExp(int[] data) {
        int month = data[0];
        int year = data[1];
        Calendar calendar = Calendar.getInstance();
        int Month = calendar.get(Calendar.MONTH);
        int Year = calendar.get(Calendar.YEAR);
        int experience = Month >= month ? Year - year : Year - year - 1;
        return experience;
    }
}
