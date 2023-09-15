package Learning;

public class Runner {

    int number12 = 5;

    public static void main(String[] args) {

        System.out.println("Hello World!");

        boolean question = false;
        byte snap = 0; //-128 - 127
        char letter = 'a';
        short smallNumber = 15000; //+-30,000ish
        int number = 8; //+-2.4 billion (overflow goes back to negative) (32-bit)
        long bigNumber = 3500000000L; //10 to the 14 (64-bit)
        float decimal = 5.5f; //32-bit decimal number
        double largeDecimal = 1.23456789d; //64-bit decimal

        byte small = 120;
        int big = small*small*small;
        long bigger = big + big + big;

        boolean maybe = big > bigger;
        String word = "blob";

        System.out.println(number);

    }

}
