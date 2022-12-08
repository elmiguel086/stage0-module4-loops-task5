package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int i = 1; i <= sideLength ; i++) {
            for (int j = 1; j <= sideLength; j++) {
                int r = sideLength/2;
                if(j==r+1)
                {
                    System.out.print(8);
                }
                else if(i==r+1)
                {
                    System.out.print(8);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
