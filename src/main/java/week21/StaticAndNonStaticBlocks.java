package week21;

public class StaticAndNonStaticBlocks {

    static int count = 1;

    static {
        System.out.println("Static");
    }

    {
        System.out.println("Non-static block");
    }

    public StaticAndNonStaticBlocks() {
        System.out.println("Constructor");
    }


}
