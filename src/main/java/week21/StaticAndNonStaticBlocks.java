package week21;

public class StaticAndNonStaticBlocks extends StaticAndNonStaticBlocksBase{
    static int count;
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public StaticAndNonStaticBlocks() {
        System.out.println("3");
    }
    public static void main(String[] args) {
        new StaticAndNonStaticBlocks();
    }
}
// 4 1 5 6 2 3
class StaticAndNonStaticBlocksBase {
    static int count;
    static {
        System.out.println("4");
    }
    {
        System.out.println("5");
    }
    public StaticAndNonStaticBlocksBase() {
        System.out.println("6");
    }
}
