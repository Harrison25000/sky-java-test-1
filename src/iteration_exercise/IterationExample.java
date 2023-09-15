package iteration_exercise;

public class IterationExample {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }

        int y = 0;
        while (y < 10) {
            System.out.println("y = " + y);
            y++;
        }

        int x = 0;
        do {
            System.out.println("x = " + x);
            x++;
        } while (x < 10);

        //------------

        for(int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " : " + j);
        }

        int b = 0, l = 10;
        while (b < l) {
            System.out.println(b + " : " + l);
            b++;
            l--;
        }

        int t = 0, u=10;
        do{
            System.out.println(t + " : " + u);
            t++;
            u--;
        }while (t < u);



        //-------------
        int sum = 0;
        for (int i = 0; i < 10; sum += i, i++) {
            System.out.println(sum);
        }

        int total = 0;
        int o = 0;
        while ( o < 10) {
            System.out.println(total);
            total += o;
            o++;
        }

        int numbers = 0;
        int w = 0;
        do {
            System.out.println(numbers);
            numbers += w;
            w++;
        } while (w < 10);

        int rocket = 10;
        while (rocket > 0) {
            System.out.println(rocket--);
        }
        System.out.println("Lift off");

        int hmm = 10;
        while (hmm > 0) {
            System.out.println("hmm is " + hmm--);
        }

        int sumNum = 0;
        for (int i = 0; i < 10; sumNum += i++);
        System.out.println("SumNum is " + sumNum);
    }
}
