package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

            int i;
            int x = 0;
            int y = height/2-1;

            if(height > 0) {
                for (i = 0; i <= height/2; i = i + 1) {


                    for (int k = 0; k < i; k++) {
                        System.out.print(" ");
                    }

                    for (int j = i+1; j <= height-x; j++) {
                        System.out.print("8");
                    }
                    x++;

                    for (int l = 0; l < i; l++) {
                        System.out.print(" ");
                    }

                    System.out.println("/n");

                    if(i+1 == height - x) {
                        break;
                    }
                }


                for (i = height/2; i > 0; i = i -1) {
                    int count = 0;
                    for (int k = 1; k < i; k++) {
                        System.out.print(" ");
                    }


                    for (int j = i; j <= height - y; j++) {
                        System.out.print("8");
                    }
                    y--;

                    for (int l = 1; l < i; l++) {
                        System.out.print(" ");
                    }

                    System.out.println("/n");
                }
            } else {
                System.out.print("");
            }


    }
}
