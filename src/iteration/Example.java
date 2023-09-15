package iteration;

public class Example {

    public static void main(String[] args) {
        int tea = 0;
        boolean notEnoughTea = true;
        do {
            System.out.println("tea " + tea);
            tea++;
            if (tea > 2) notEnoughTea = false;
        } while (notEnoughTea);

        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 7){
                break;
            }

            System.out.println(i);

        }
    }
    
}
