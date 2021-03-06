package week08.student;

import java.util.Objects;

public class StudentSample {
    public static void main(String[] args) {
        Student igor = new Student("Igor", "Akinfeev");
        System.out.println(igor);

        Object student1 = new Student(null, "Andreev");
        Object student2 = new Student("Bbb", "Andreev");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//true
        System.out.println(student1.equals((Student) null));//false
        Object s1 = new String("s1");
        Object s2 = new String("s1");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(student1.equals(new Object()));//false

        System.out.println(student1.hashCode());
        System.out.println(((Student) student1).hashCodeByHCB());
        System.out.println(((Student) student1).hashCodeByIdea());
        System.out.println(Objects.hashCode(student1));
    }
}
