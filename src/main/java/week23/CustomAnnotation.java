package week23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ForStringArguments {
    }

}
