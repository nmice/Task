package com.task;
/* Task01_017 - Write 18 mathematical expressions
in accordance with the rules of the programming language" */

public class Task01_017 {

    public static void main(String[] args) throws Exception {
        int x1=3, x2=4;
        double example1 = (Math.sqrt(Math.pow(x1,2) + Math.pow(x2,2)));
        System.out.println("1) Square root of (x1^2+x2^2)=" + example1);

        int x3=5;
        int example2 = x1*x2+x1*x3+x2*x3;
        System.out.println("2) x1*x2+x1*x3+x2*x3=" + example2);

        int v0=15, t=2, a=12;
        double example3 = v0*t+a*Math.pow(t,2)/2;
        System.out.println("3) v0*t+(a*t^2/2)=" + example3);

        double g=9.8, m=5, v=10, h=12;
        double example4 = m*Math.pow(v,2)/2+m*g*h;
        System.out.println("4) m*v^2/2+m*g*h=" + example4);

        double R1=1.0, R2=2.0;
        double example5 = 1/R1+1/R2;
        System.out.println("5) 1/R1+1/R2=" + example5);

        double alpha=30;
        double example6 = m*g*Math.cos(alpha);
        System.out.println("6) m*g*cos alpha=" + example6);

        double R=3.2;
        double example7 = 2*Math.PI*R;
        System.out.println("7) 2*Pi*R=" + example7);

        int b=6, c=7;
        double example8 = Math.pow(b,2)-4*a*c;
        System.out.println("8) b^2-4*a*c=" + example8);

        double sigma = 15, m1=2.5, m2=3.2, r1=8;
        double example9 = sigma*m1*m2/r1;
        System.out.println("9) sigma*(m1*m2/r1)=" + example9);

        double I = 2;
        double example10 = Math.pow(I,2)*R;
        System.out.println("10) I^2*R=" + example10);

        double example11 = a*b*Math.sin(c);
        System.out.println("11) a*b*sin c=" + example11);

        double example12 = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(c));
        System.out.println("12) Square root of (a^2+b^2-2*a*b*cos c)=" + example12);

        double d = 4.2;
        double example13 = (a*d+b*c)/(a*d);
        System.out.println("13) (a*d+b*c)/(a*d)=" + example13);

        double x=45;
        double example14 = Math.sqrt(1-Math.pow(Math.sin(x),2));
        System.out.println("14) Square root of (1-sin^2 x)=" + example14);

        double example15 = 1/Math.sqrt(a*Math.pow(x,2)+b*x+c);
        System.out.println("15) 1/Square root of (a*x^2+b*x+c)=" + example15);

        double example16 = (Math.sqrt(x+1)+Math.sqrt(x-1))/(2*Math.sqrt(x));
        System.out.println("16) (Square root of (x+1)+ Square root of (x-1))/(2*Square root of x)=" + example16);

        double example17 = Math.abs(x)+Math.abs(x+1);
        System.out.println("17)|x|+|x+1|=" + example17);
        
        double example18 = Math.abs(1-Math.abs(x));
        System.out.println("18)|1-|x||=" + example18);
    }
}
