public class test {

    private static String KOTLIN = "KOTLIN";

    public static void main(String[] args) {
        test.doThis();
        System.out.println(test.KOTLIN);
        KOTLIN = KOTLIN.toLowerCase();
        System.out.println(test.KOTLIN);
    }
    public static void doThis(){
        System.out.println("doThis called!");
    }
}
