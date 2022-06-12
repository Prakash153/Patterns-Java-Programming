package Patterns1;

public class NaturalNumPatt {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%02d  ", ++count);
            }
            System.out.println("");
        }
    }
}
