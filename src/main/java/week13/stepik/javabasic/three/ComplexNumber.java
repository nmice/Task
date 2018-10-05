package week13.stepik.javabasic.three;

public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return 17 * (Double.hashCode(getRe()) + 17 * Double.hashCode(getIm()));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ComplexNumber)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ComplexNumber that = (ComplexNumber) obj;
        return this.getRe() == that.getRe() && this.getIm() == that.getIm();
    }
}
