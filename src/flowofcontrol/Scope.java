package flowofcontrol;

public class Scope {
    public static String msg = "My message"; //Whole class scope;


    public static void newMethod() {
        String localMsg = "local message";
        System.out.println(msg + " : " + localMsg);


        for (int i = 0; i < 4; i++){
            int number = 30;
            number += i;
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        newMethod();
    }
}
