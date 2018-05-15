package com.task;
/* Task02_013 - Given a three-digit number.
Find the number obtained by reading its digits from right to left.*/

public class Task02_013 {

    public static void main(String[] args) throws Exception {
    int i = 213;
    int hundred = i/100;
    int ten = (i-hundred*100)/10;
    int digit = i-hundred*100-ten*10;
    System.out.println(digit+""+ten+""+hundred);
    }
}
