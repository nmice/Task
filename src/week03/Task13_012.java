package week03;

import util.CalcExperience;

/**
 * The information on 20 employees of the firm is known: a surname, a name, a patronymic, the address and
 * date of receipt on work (month, year). Print the last name, first name, patronymic and address of employees
 * who have worked at the company for at least three years. The day of the month is not taken into account
 * (if the month of arrival coincides with the month of today, it is considered that a full year has passed).
 */

public class Task13_012 {

    public static class Employe {
        String name;
        String address;
        int[] data = new int[2];
        int month = data[0];
        int year = data[1];

        public int getMonth(int month) {
            return month;
        }

        public int getYear(int year) {
            return year;
        }

        public static void main(String... args) {
            Employe employe1 = new Employe();
            Employe employe2 = new Employe();
            Employe employe3 = new Employe();
            Employe employe4 = new Employe();
            Employe employe5 = new Employe();
            Employe employe6 = new Employe();
            Employe employe7 = new Employe();
            Employe employe8 = new Employe();
            Employe employe9 = new Employe();
            Employe employe10 = new Employe();
            Employe employe11 = new Employe();
            Employe employe12 = new Employe();
            Employe employe13 = new Employe();
            Employe employe14 = new Employe();
            Employe employe15 = new Employe();
            Employe employe16 = new Employe();
            Employe employe17 = new Employe();
            Employe employe18 = new Employe();
            Employe employe19 = new Employe();
            Employe employe20 = new Employe();

            employe1.name = "John Den Malcovich";
            employe2.name = "Valery Alex Kipelov";
            employe3.name = "Bongo Pongo Bibungo";
            employe4.name = "Kovrov Valintin Andreevich";
            employe5.name = "Val Broocks Kilmer";
            employe6.name = "Poo Kaka Maka";
            employe7.name = "John Den Malcovich";
            employe8.name = "Valery Alex Kipelov";
            employe9.name = "Bongo Pongo Bibungo";
            employe10.name = "Lovrov Valintin Andreevich";
            employe11.name = "Mal Broocks Kilmer";
            employe12.name = "Drue Kaka Maka";
            employe13.name = "Caroline Mac Queen";
            employe14.name = "Nike Ibn Borzov";
            employe15.name = "Brad Pitt Olegovich";
            employe16.name = "Tom Cruze Jeffry";
            employe17.name = "Penelopa Cruize Junior";
            employe18.name = "Greg Man Hate";
            employe19.name = "Mike Java Lang";
            employe20.name = "Cry All Night";

            employe1.address = "Minsk, Belarus";
            employe2.address = "Moscow, Russia";
            employe3.address = "Paris, France";
            employe4.address = "Minsk, Belarus";
            employe5.address = "Moscow, Russia";
            employe6.address = "Paris, France";
            employe7.address = "Minsk, Belarus";
            employe8.address = "Moscow, Russia";
            employe9.address = "Paris, France";
            employe10.address = "Minsk, Belarus";
            employe11.address = "Moscow, Russia";
            employe12.address = "Paris, France";
            employe13.address = "Minsk, Belarus";
            employe14.address = "Moscow, Russia";
            employe15.address = "Paris, France";
            employe16.address = "Minsk, Belarus";
            employe17.address = "Moscow, Russia";
            employe18.address = "Paris, France";
            employe19.address = "Minsk, Belarus";
            employe20.address = "Moscow, Russia";

            employe1.data = new int[]{5, 2015};
            employe2.data = new int[]{2, 2018};
            employe3.data = new int[]{1, 2010};
            employe4.data = new int[]{5, 2015};
            employe5.data = new int[]{2, 2018};
            employe6.data = new int[]{1, 2010};
            employe7.data = new int[]{5, 2015};
            employe8.data = new int[]{2, 2018};
            employe9.data = new int[]{1, 2010};
            employe10.data = new int[]{5, 2015};
            employe11.data = new int[]{2, 2018};
            employe12.data = new int[]{1, 2010};
            employe13.data = new int[]{5, 2015};
            employe14.data = new int[]{2, 2018};
            employe15.data = new int[]{1, 2010};
            employe16.data = new int[]{5, 2015};
            employe17.data = new int[]{2, 2018};
            employe18.data = new int[]{1, 2010};
            employe19.data = new int[]{5, 2015};
            employe20.data = new int[]{2, 2018};

            String employeList = "", employeNew = "";
            System.out.println("Over 3 year experience: " + employeList);
            if (CalcExperience.calcExp(employe1.data) >= 3) {
                System.out.println(employe1.name);
            }
            if (CalcExperience.calcExp(employe2.data) >= 3) {
                System.out.println(employe2.name);
            }
            if (CalcExperience.calcExp(employe3.data) >= 3) {
                System.out.println(employe3.name);
            }
            if (CalcExperience.calcExp(employe4.data) >= 3) {
                System.out.println(employe4.name);
            }
            if (CalcExperience.calcExp(employe5.data) >= 3) {
                System.out.println(employe5.name);
            }
            if (CalcExperience.calcExp(employe6.data) >= 3) {
                System.out.println(employe1.name);
            }
            if (CalcExperience.calcExp(employe7.data) >= 3) {
                System.out.println(employe2.name);
            }
            if (CalcExperience.calcExp(employe8.data) >= 3) {
                System.out.println(employe3.name);
            }
            if (CalcExperience.calcExp(employe9.data) >= 3) {
                System.out.println(employe4.name);
            }
            if (CalcExperience.calcExp(employe10.data) >= 3) {
                System.out.println(employe5.name);
            }
            if (CalcExperience.calcExp(employe11.data) >= 3) {
                System.out.println(employe1.name);
            }
            if (CalcExperience.calcExp(employe12.data) >= 3) {
                System.out.println(employe2.name);
            }
            if (CalcExperience.calcExp(employe13.data) >= 3) {
                System.out.println(employe3.name);
            }
            if (CalcExperience.calcExp(employe14.data) >= 3) {
                System.out.println(employe4.name);
            }
            if (CalcExperience.calcExp(employe15.data) >= 3) {
                System.out.println(employe5.name);
            }
            if (CalcExperience.calcExp(employe16.data) >= 3) {
                System.out.println(employe1.name);
            }
            if (CalcExperience.calcExp(employe17.data) >= 3) {
                System.out.println(employe2.name);
            }
            if (CalcExperience.calcExp(employe18.data) >= 3) {
                System.out.println(employe3.name);
            }
            if (CalcExperience.calcExp(employe19.data) >= 3) {
                System.out.println(employe4.name);
            }
            if (CalcExperience.calcExp(employe20.data) >= 3) {
                System.out.println(employe5.name);
            }

        }
    }
}
