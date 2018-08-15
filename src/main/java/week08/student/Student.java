package week08.student;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

/**
 * Implement three variants of methods hashcode () & equals () for class Student
 */

public class Student {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {//BY MySelf
        if (firstName == null) {
            return 16337 + lastName.hashCode();
        }
        if (lastName == null) {
            return 16337 + 31 * firstName.hashCode();
        }
        return 16337 + 31 * firstName.hashCode() + lastName.hashCode();
    }

    public int hashCodeByIdea() {//BY IDEA
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public int hashCodeByHCB() {//BY HashCodeBuilder
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {//TODO - DONE BY MySelf
        if (!(obj instanceof Student)) {
            return false;
        }
        if (this == obj) {
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

    public boolean equalsByIdea(Object o) {//BY IDEA
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    public boolean equalsByEB(Object o) {//BY EqualsBuilder
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder()
                .append(firstName, student.firstName)
                .append(lastName, student.lastName)
                .isEquals();
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + "]";
    }
}