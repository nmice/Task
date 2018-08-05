package week08.student;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {//BY MySelf
        int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    /*    @Override
    public int hashCode() {//BY IDEA
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }*/

    /*    @Override
    public int hashCode() {//BY HashCodeBuilder
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }*/


    @Override
    public boolean equals(Object obj) {//TODO - DONE BY MySelf
        if (!(obj instanceof Student)) {
            return false;
        }
        if (this == obj){
            return true;
        }
        Student that = (Student) obj;
        String f1 = this.firstName;
        String f2 = that.firstName;
        String l1 = this.lastName;
        String l2 = that.lastName;
        if (f1 == null && f2 == null) {
            if (l1 == null && l2 == null) return true;
            if (l1 != null && l2 != null) return l1.equals(l2);
        }
        if (f1 != null && f2 != null) {
            if (l1 == null && l2 == null) return f1.equals(f2);
            if (l1 != null && l2 != null)
                return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName);
        }
        return false;
    }

/*    @Override
    public boolean equals(Object o) {//BY IDEA
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }*/

/*    @Override
    public boolean equals(Object o) {//BY EqualsBuilder
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder()
                .append(firstName, student.firstName)
                .append(lastName, student.lastName)
                .isEquals();
    }*/

    public String toString() {
        return "[" + firstName + ", " + lastName + "]";
    }
}