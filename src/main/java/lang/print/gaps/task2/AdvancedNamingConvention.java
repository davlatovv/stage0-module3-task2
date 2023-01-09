package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;
    private int age;
    private int phoneNumber;

    void callToFriend() {
        System.out.println("Call to my friend" + phoneNumber);
    }

    public static void callByNumber(int number) {
        System.out.println("My number" + number);
    }
}
