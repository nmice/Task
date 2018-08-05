package week08.student;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student1 = new Student("Igor","Mazepa");
    private Student student2 = new Student("Lou","Bega");//f
    private Student student3 = new Student("Igor","Mazepa");//t
    private Student student4 = new Student(null, "Mazepa");//f
    private Student student5 = new Student("Igor", null);//f    //f
    private Student student6 = new Student(null, "Mazepa");//f  //t
    private Student student7 = new Student(null, null);   //f   //f    //t
    private Student student8 = new Student(null, null);   //t


    @Test
    public void hashCodeTest() {
        int expected = Objects.hashCode(student1);
        int actual = student1.hashCode();
        assertEquals(expected, actual);
        int expected2 = student3.hashCode();
        assertEquals(expected2, actual);
    }

    @Test
    public void hashCodeByIdea() {
        int actual = student1.hashCodeByIdea();
        int expected = student3.hashCodeByIdea();
        assertEquals(expected, actual);
    }

    @Test
    public void hashCodeByHCB() {
        int actual = student1.hashCodeByHCB();
        int expected = student3.hashCodeByHCB();
        assertEquals(expected, actual);
    }

    @Test
    public void equals() {
        boolean expected1 = true;
        boolean actual1 = student1.equals(student1);
        assertEquals(expected1, actual1);
        boolean expected2 = false;
        boolean actual2 = student1.equals(student2);
        assertEquals(expected2, actual2);
        boolean expected3 = true;
        boolean actual3 = student1.equals(student3);
        assertEquals(expected3, actual3);
        boolean expected4 = false;
        boolean actual4 = student1.equals(student4);
        assertEquals(expected4, actual4);
        boolean expected5 = false;
        boolean actual5 = student1.equals(student5);
        assertEquals(expected5, actual5);
        boolean expected6 = false;
        boolean actual6 = student1.equals(student6);
        assertEquals(expected6, actual6);
        boolean expected7 = false;
        boolean actual7 = student1.equals(student7);
        assertEquals(expected7, actual7);
        boolean expected8 = false;
        boolean actual8 = student4.equals(student5);
        assertEquals(expected8, actual8);
        boolean expected9 = true;
        boolean actual9 = student4.equals(student6);
        assertEquals(expected9, actual9);
        boolean expected10 = false;
        boolean actual10 = student4.equals(student7);
        assertEquals(expected10, actual10);
        boolean expected11 = true;
        boolean actual11 = student7.equals(student8);
        assertEquals(expected11, actual11);
    }

    @Test
    public void equalsByIdea() {
        boolean expected1 = true;
        boolean actual1 = student1.equalsByIdea(student1);
        assertEquals(expected1, actual1);
        boolean expected2 = false;
        boolean actual2 = student1.equalsByIdea(student2);
        assertEquals(expected2, actual2);
        boolean expected3 = true;
        boolean actual3 = student1.equalsByIdea(student3);
        assertEquals(expected3, actual3);
        boolean expected4 = false;
        boolean actual4 = student1.equalsByIdea(student4);
        assertEquals(expected4, actual4);
        boolean expected5 = false;
        boolean actual5 = student1.equalsByIdea(student5);
        assertEquals(expected5, actual5);
        boolean expected6 = false;
        boolean actual6 = student1.equalsByIdea(student6);
        assertEquals(expected6, actual6);
        boolean expected7 = false;
        boolean actual7 = student1.equalsByIdea(student7);
        assertEquals(expected7, actual7);
        boolean expected8 = false;
        boolean actual8 = student4.equalsByIdea(student5);
        assertEquals(expected8, actual8);
        boolean expected9 = true;
        boolean actual9 = student4.equalsByIdea(student6);
        assertEquals(expected9, actual9);
        boolean expected10 = false;
        boolean actual10 = student4.equalsByIdea(student7);
        assertEquals(expected10, actual10);
        boolean expected11 = true;
        boolean actual11 = student7.equalsByIdea(student8);
        assertEquals(expected11, actual11);
    }

    @Test
    public void equalsByEB() {
        boolean expected1 = true;
        boolean actual1 = student1.equalsByEB(student1);
        assertEquals(expected1, actual1);
        boolean expected2 = false;
        boolean actual2 = student1.equalsByEB(student2);
        assertEquals(expected2, actual2);
        boolean expected3 = true;
        boolean actual3 = student1.equalsByEB(student3);
        assertEquals(expected3, actual3);
        boolean expected4 = false;
        boolean actual4 = student1.equalsByEB(student4);
        assertEquals(expected4, actual4);
        boolean expected5 = false;
        boolean actual5 = student1.equalsByEB(student5);
        assertEquals(expected5, actual5);
        boolean expected6 = false;
        boolean actual6 = student1.equalsByEB(student6);
        assertEquals(expected6, actual6);
        boolean expected7 = false;
        boolean actual7 = student1.equalsByEB(student7);
        assertEquals(expected7, actual7);
        boolean expected8 = false;
        boolean actual8 = student4.equalsByEB(student5);
        assertEquals(expected8, actual8);
        boolean expected9 = true;
        boolean actual9 = student4.equalsByEB(student6);
        assertEquals(expected9, actual9);
        boolean expected10 = false;
        boolean actual10 = student4.equalsByEB(student7);
        assertEquals(expected10, actual10);
        boolean expected11 = true;
        boolean actual11 = student7.equalsByEB(student8);
        assertEquals(expected11, actual11);
    }

}