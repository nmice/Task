package week08.student;

import org.apache.commons.lang3.builder.EqualsBuilder;
import week07.Task_LinkedList.LinkedListOwn;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + "]";
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

/*    @Override
    public int hashCode() {
        return super.hashCode();
    }*/

/*    @Override
    public boolean equals(Object obj) {//TODO
        if (!(obj instanceof Student)){
            return false;
        }
        Student that = (Student) obj;
        if (this.firstName == null && this.lastName == null && that.firstName == null && that.lastName == null){
            return true;
        }
        if (this.firstName == null && this.lastName != null && that.firstName == null && that.lastName != null){
            return (this.lastName.equals(that.lastName));
        }
        return (this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName));
    }*/

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }*/



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder()
                .append(firstName, student.firstName)
                .append(lastName, student.lastName)
                .isEquals();
    }


}
