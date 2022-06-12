package Patterns1;

public class UseOfCount {
    public static void main(String args[]) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%02d  ", ++count);
            }
            System.out.println("");
        }
    }
}
