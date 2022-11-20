package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 3) {
            int i3;
            int x3 = 1;


            for (i3 = 1; i3 <= height; i3 = i3 + 2) {

                for (int k = 1; k <= i3 - x3; k++) {
                    System.out.print(" ");
                }
                x3++;

                for (int j = i3; j <= height; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }

            for (i3 = height - 2; i3 >= 0; i3 = i3 - 2) {
                for (int k = height; k <= i3; k++) {
                    System.out.print(" ");
                }


                for (int j = i3; j <= height; j++) {
                    System.out.print("8");
                }

                System.out.println();
            }
        } else if (height == 5) {
            int i;
            int x = 1;
            int y = 2;

            for (i = 1; i <= height; i = i + 2) {

                for (int k = 1; k <= i - x; k++) {
                    System.out.print(" ");
                }
                x++;

                for (int j = i; j <= height; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }

            for (i = height - 2; i >= 0; i = i - 2) {
                for (int k = height; k <= i + y; k++) {
                    System.out.print(" ");
                }


                for (int j = i; j <= height; j++) {
                    System.out.print("8");
                }
                y++;
                System.out.println();
            }
        } else if (height == 6) {
            int i;
            int x6 = 1;
            int y6 = 2;

            for (i = 1; i <= height; i = i + 2) {

                for (int k = 1; k <= i - x6; k++) {
                    System.out.print(" ");
                }
                x6++;

                for (int j = i; j <= height; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }

            for (i = height - 1; i >= 0; i = i - 2) {
                for (int k = height; k <= i + y6; k++) {
                    System.out.print(" ");
                }


                for (int j = i; j <= height; j++) {
                    System.out.print("8");
                }
                y6++;
                System.out.println();
            }
        } else {
            System.out.println();
        }


    }
}
