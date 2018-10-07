package week14;

import java.lang.reflect.Field;

public class NoSetterTestDrive {

    public static void main(String[] args) {
        TryToSet testObject = new TryToSet();
        System.out.printf(String.valueOf(testObject.getVarValue()));
    }
}

class TryToSet extends NoSetter {
    public int getVarValue() {
        try {
            Field field = NoSetter.class.getDeclaredField("value");
            field.setAccessible(true);
            return field.getInt(this);
        } catch (NoSuchFieldException e) {
            System.out.printf("Error: " + e.toString());
        } catch (IllegalAccessException e) {
            System.out.printf("Error: " + e.toString());
        }
        return 0;
    }
}
