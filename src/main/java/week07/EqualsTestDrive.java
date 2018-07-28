package week07;

public class EqualsTestDrive {
    public static void main(String[] args) {
        Object o = "1";
        System.out.println(o.hashCode());
        Object student1 = new Student("Bbb", "Andreev");
        Object student2 = new Student("Bbb", "Andreev");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//true
        Object s1 = new String("s1");
        Object s2 = new String("s1");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }

    private static class Student {
        private final String firstName;
        private final String lastName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }
        @Override
        public boolean equals(Object student) {
            if (student.firstName == null && firstName == null) {
                return true;
            }
            if (student.lastName == null && lastName == null) {
                return true;
            }
            if (student.firstName == null && firstName != null) {
                return false;
            }
            if (student.lastName == null && lastName != null) {
                return false;
            }
            return (student.firstName.equals(firstName) && student.lastName.equals(lastName));
        }
    }
}
