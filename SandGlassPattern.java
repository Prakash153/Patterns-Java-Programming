package Patterns1;

public class SandGlassPattern {
    public static void main(String args[]) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
