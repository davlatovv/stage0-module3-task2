package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int adultAge = 18;
    private int age;
    private int phoneNumber;

    void CallToFriend() {
        System.out.println("Call to my friend" + phoneNumber);
    }

    public static void CallByNumber(int Number) {
        System.out.println("My number" + Number);
    }
}
