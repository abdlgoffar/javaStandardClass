package learnRandomNumber;

import java.util.Random;

public class TryRandom {
    public static void main(String[] args) {
        Random dataRandom = new Random();
        for (int i = 0; i <= 10; i++)
        {
            int data = dataRandom.nextInt(100);
            System.out.println("data random kurang dari 100 : " + data);
        }
    }
}
