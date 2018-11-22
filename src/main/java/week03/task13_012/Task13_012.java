package week03.task13_012;
/**
 * The information on 20 employees of the firm is known: a surname, a name, a patronymic, the address and
 * date of receipt on work (month, year). Print the last name, first name, patronymic and address of employees
 * who have worked at the company for at least three years. The day of the month is not taken into account
 * (if the month of arrival coincides with the month of today, it is considered that a full year has passed).
 */

import java.util.ArrayList;

import static week03.task13_012.EmployeeConstants.*;

public class Task13_012 {

    public static void main(String... args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(NAME1, ADDRESS1, DATE1));
        employees.add(new Employee(NAME2, ADDRESS2, DATE2));
        employees.add(new Employee(NAME3, ADDRESS3, DATE3));
        employees.add(new Employee(NAME4, ADDRESS4, DATE4));
        employees.add(new Employee(NAME5, ADDRESS5, DATE5));
        employees.add(new Employee(NAME6, ADDRESS6, DATE6));
        employees.add(new Employee(NAME7, ADDRESS7, DATE7));
        employees.add(new Employee(NAME8, ADDRESS8, DATE8));
        employees.add(new Employee(NAME9, ADDRESS9, DATE9));
        employees.add(new Employee(NAME10, ADDRESS10, DATE10));
        employees.add(new Employee(NAME11, ADDRESS11, DATE11));
        employees.add(new Employee(NAME12, ADDRESS12, DATE12));
        employees.add(new Employee(NAME13, ADDRESS13, DATE13));
        employees.add(new Employee(NAME14, ADDRESS14, DATE14));
        employees.add(new Employee(NAME15, ADDRESS15, DATE15));
        employees.add(new Employee(NAME16, ADDRESS16, DATE16));
        employees.add(new Employee(NAME17, ADDRESS17, DATE17));
        employees.add(new Employee(NAME18, ADDRESS18, DATE18));
        employees.add(new Employee(NAME19, ADDRESS19, DATE19));
        employees.add(new Employee(NAME20, ADDRESS20, DATE20));

        for (Employee employee : employees) {
            if (employee.getExperience() >= 5) {// CalcExperience.calcExp(employee1.data) >= 5) {
                System.out.println(employee);
            }
        }
    }
}
