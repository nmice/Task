package week03.task13_012;

import java.util.Calendar;
import java.util.Scanner;

public class Task13_012G {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int today_y = calendar.get(Calendar.YEAR);
        int today_m = calendar.get(Calendar.MONTH) + 1;
        int numberOfEmployees;
        int choice;
        Employee[] employees;
        int[] searchResult;

        choice = dialogCreateArrayOrUseAnExample();
        if (choice == 0) {
            numberOfEmployees = getIntegerFromKeyboard("number of employees");
            employees = new Employee[numberOfEmployees];
            fillAnEmployeesArray(employees);
        } else if (choice == 1) {
            employees = new Employee[20];
            fillAnEmployeesArrayWithTestValues(employees);
        } else {
            return;
        }

        while (true) {
            choice = dialogPrintArrayOrSearchInIt();
            if (choice == 0) {
                printAnEmployeesArray(employees);
                continue;
            }
            if (choice == 1) {
                choice = dialogSearchByNameOrByWorkingtime();
                if (choice == 0) {
                    for (int i = 0; i < 100; i++) {
                        System.out.print("\n\n\n\n\n\n\n");
                    }
                    double minWorkingTime = getDoubleFromKeyboard("minimal length of work");
                    choice = dialogEnterDateOrUseCurrent();
                    if (choice == 0) {
                        searchResult = Searcher.byLengthOfWork(employees, minWorkingTime, today_y, today_m);
                        Searcher.printSearchResult(employees, searchResult);
                        continue;
                    }
                    if (choice == 1) {
                        today_y = getIntegerFromKeyboard("end date of the work (year)");
                        today_m = getIntegerFromKeyboard("end date of the work (month)");
                        searchResult = Searcher.byLengthOfWork(employees, minWorkingTime, today_y, today_m);
                        Searcher.printSearchResult(employees, searchResult);
                        continue;
                    } else {
                        break;
                    }
                }
                if (choice == 1) {
                    String substring = getStringFromKeyboard("substring");
                    Searcher.printSearchResult(employees, Searcher.bySubstring(employees, substring));
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static int dialogEnterDateOrUseCurrent() {
        System.out.println("_______________________________________________________________________");
        System.out.println("Please input digit for the desired action or enter other digit to exit:");
        System.out.println("0. Use current date");
        System.out.println("1. Use date entered from keyboard");
        System.out.println("_______________________________________________________________________");
        return getIntegerFromKeyboard("your choice");
    }

    public static int dialogSearchByNameOrByWorkingtime() {
        for (int i = 0; i < 100; i++) {
            System.out.print("\n\n\n\n\n\n\n");
        }
        System.out.println("_______________________________________________________________________");
        System.out.println("Please input digit for the desired action or enter other digit to exit:");
        System.out.println("0. Search by the length of work");
        System.out.println("1. Search by the name");
        System.out.println("_______________________________________________________________________");
        return getIntegerFromKeyboard("your choice");
    }

    public static int dialogPrintArrayOrSearchInIt() {
        System.out.println("_______________________________________________________________________");
        System.out.println("Please input digit for the desired action or enter other digit to exit:");
        System.out.println("0. Print array of employees");
        System.out.println("1. Search in an array of employees");
        System.out.println("_______________________________________________________________________");
        return getIntegerFromKeyboard("your choice");
    }

    public static int dialogCreateArrayOrUseAnExample() {
        System.out.println("Please input digit for the desired action or enter other digit to exit:");
        System.out.println("0. Create and fill array of employees from the keyboard");
        System.out.println("1. Fill array of employees with test values");
        System.out.println("________________________________________________________________________");
        return getIntegerFromKeyboard("your choice");
    }

    public static Employee[] fillAnEmployeesArrayWithTestValues(Employee[] array) {
        array[0] = new Employee("Neginskij", "Grigorij", "Borisovich", "ul. Dekabristov 17", 2012, 2);
        array[1] = new Employee("Sergeev", "Andrej", "Valerevich", "ul.Pushkina 36", 2010, 5);
        array[2] = new Employee("Varfolomeev", "Sergej", "Vitalevich", "Xibinskij proezd 14", 2003, 6);
        array[3] = new Employee("Konovalov", "Andrej", "Andreevich", "ul.Palexskaya 14", 2006, 4);
        array[4] = new Employee("Fedorova", "Darya", "Sergeevna", "Kashirskoe Shosse 31 ", 2013, 1);
        array[5] = new Employee("Mishukov", "Fedor", "Vladimirovich", "ul.Vavilova 46 ", 1991, 7);
        array[6] = new Employee("Alekseeva", "Aleksandra", "Vladimirovna", "ul. Marshala Katukova 22", 2010, 9);
        array[7] = new Employee("Lesin", "Stanislav", "Stanislavovich", "ul. Trockogo 6", 2007, 5);
        array[8] = new Employee("Dorozhkin", "Kirill", "Aleksandrovich", "proezd Shokalskogo 14 ", 2004, 8);
        array[9] = new Employee("Demcev", "Grigorij", "Andreevich", "proezd Gerberta Shildta 4", 2014, 2);
        array[10] = new Employee("Kitajcev", "Stanislav", "Igorevich", "ul. Menzhinskogo", 2004, 1);
        array[11] = new Employee("Knut", "Donald", "Ivanovich", "Luzhneckaya naberezhnaya 36", 1991, 4);
        array[12] = new Employee("Demidovich", "Andrej", "Sergeevich", "proezd Roterta 16", 1997, 8);
        array[13] = new Employee("Ejler", "Leonard", " ", "Vasilevskij Ostrov 10", 2000, 2);
        array[14] = new Employee("Flenagan", "Devid", "Devidovich", "ul. Akademika Yangelya 10", 1992, 5);
        array[15] = new Employee("Serra", "Ketti", "Aleksandrovna", "ul. Tupoleva 16 ", 2001, 7);
        array[16] = new Employee("Sergeeva", "Irina", "Vladimirovna ", "ul. Domodedovskaya", 1994, 12);
        array[17] = new Employee("Drozhzhin", "Dmitrij", "Sergeevich", "ul. Radio 54", 1999, 11);
        array[18] = new Employee("Pavlov", "Vitalij", "Georgievich", "ul. Startovaya 19", 2004, 10);
        array[19] = new Employee("Olneva", "Galina", "Vasilevna", "Anadyrskij proezd 16", 2003, 9);
        return array;
    }

    public static void fillAnEmployeesArray(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            String lastName = getStringFromKeyboard("last name of " + (i + 1) + " employee");
            String firstName = getStringFromKeyboard("first name of " + (i + 1) + " employee");
            String patronymic = getStringFromKeyboard("patronymic of " + (i + 1) + " employee");
            String address = getStringFromKeyboard("address of " + (i + 1) + " employee");
            int date_y = getIntegerFromKeyboard("a year for " + (i + 1) + " employee");
            int date_m = getIntegerFromKeyboard("a month for " + (i + 1) + " employee");
            for (int j = 0; j < 100; j++) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
            }
            array[i] = new Employee(lastName, firstName, patronymic, address, date_y, date_m);
        }
    }

    public static void printAnEmployeesArray(Employee[] array) {
        for (Employee anArray : array) {
            anArray.printData();
        }
    }

    public static double getDoubleFromKeyboard(String valueName) {
        System.out.print("Please enter " + valueName + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static int getIntegerFromKeyboard(String valueName) {
        System.out.print("Please enter " + valueName + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getStringFromKeyboard(String valueName) {
        System.out.print("Please enter " + valueName + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static class Employee {
        private String lastName;
        private String firstName;
        private String patronymic;
        private String address;
        private String totalName;
        private int date_y;
        private int date_m;

        public Employee(String lastName, String firstName, String patronymic, String address, int date_y, int date_m) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.patronymic = patronymic;
            this.address = address;
            this.date_y = date_y;
            this.date_m = date_m;
            this.totalName = lastName + " " + firstName + " " + patronymic;
        }

        public Employee(String lastName, String firstName, String address, int date_y, int date_m) {
            this(lastName, firstName, "", address, date_y, date_m);
        }

        public String getTotalName() {
            return totalName;
        }

        public void printData() {
            System.out.println(this.totalName + ", " + this.address + ", " + this.date_y + " " + this.date_m);
        }

        /**
         * Returns time (in years) from date of applying for a job till today
         */
        public double getWorkingTime(int dateYtoday, int dateMtoday) {
            int date_m = this.date_m;
            int date_y = this.date_y;
            dateMtoday += dateYtoday * 12;
            date_m += date_y * 12;
            return (dateMtoday - date_m) / 12.;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getDate_m() {
            return date_m;
        }

        public void setDate_m(int date_m) {
            this.date_m = date_m;
        }

        public int getDate_y() {
            return date_y;
        }

        public void setDate_y(int date_y) {
            this.date_y = date_y;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

    }

    //------------------------------------------------------------------------------------------------------------------
    public static class Searcher {

        public static void printSearchResult(Employee[] array, int[] searchResult) {
            for (int aSearchResult : searchResult) {
                array[aSearchResult].printData();
            }
        }

        public static String upCase(String s) {
            return s.toUpperCase();
        }

        /**
         * Returns array of results indices
         */
        public static int[] byLengthOfWork(Employee[] array, double minWorkingTime, int dateYtoday, int dateMtoday) {
            int[] result_buffer = new int[999];
            int result_index = 0;
            for (int i = 0; i < array.length; i++) {
                double currentWorkingTime = array[i].getWorkingTime(dateYtoday, dateMtoday);
                if (currentWorkingTime >= minWorkingTime) {
                    result_buffer[result_index] = i;
                    result_index++;
                }
            }
            return getCleanResult(result_buffer, new int[result_index]);
        }

        /**
         * Returns array of results indices
         */
        public static int[] bySubstring(Employee[] array, String substring) {
            substring = upCase(substring);
            int[] result_buffer = new int[999];

            int result_index = 0;
            for (int i = 0; i < array.length; i++) {
                String currentName = (upCase(array[i].getTotalName()));
                if (currentName.contains(substring)) {
                    result_buffer[result_index] = i;
                    result_index++;
                }
            }

            int[] result = getCleanResult(result_buffer, new int[result_index]);
            return result;
        }

        /**
         * Copies results of search to array with matching size
         * so that only first [result.length] elements take place
         */
        public static int[] getCleanResult(int[] result_buffer, int[] result) {
            for (int i = 0; i < result.length; i++) {
                result[i] = result_buffer[i];
            }
            return result;
        }
    }
}
