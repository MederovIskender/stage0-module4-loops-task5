package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        printHourglass(height);
    }

    public static void printHourglass(int height) {
        int size = height/2;
        for (int i = size; i >= 1; i--) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
