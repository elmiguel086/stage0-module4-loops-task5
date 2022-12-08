package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        for (int i = 0; i < height/2; i++) {
            for (int j = 0; j < height; j++) {
                if(i==0){
                    System.out.print(8);
                }else if(i<=j && j<height-i) {
                    System.out.print(8);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        if(height%2!=0)
        {
            for (int i = 0; i < height; i++) {
                if(i==height/2)
                    System.out.print(8);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = height/2; i > 0; i--) {
            for (int j = 0; j < height; j++) {
                if(i<=j+1 && j<=height-i) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
