package week13.stepik.javabasic.three;

import java.nio.charset.StandardCharsets;

public class AsciiCharSequence implements CharSequence {

    private byte[] byteArray = new byte[0];

    public AsciiCharSequence(byte[] bytes) {
        byteArray = bytes;
    }

    public AsciiCharSequence() {
        this(new byte[0]);
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] result = new byte[end - start];
        System.arraycopy(byteArray, start, result, 0, end - start);
        return new AsciiCharSequence(result);
    }

    @Override
    public String toString() {
        return new String(byteArray, StandardCharsets.US_ASCII);
    }
}
