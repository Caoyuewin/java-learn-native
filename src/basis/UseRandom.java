package basis;

import java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(10));

        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(10) + 1);
    }


}
