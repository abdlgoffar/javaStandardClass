package learnUniqueData;

import java.util.UUID;

public class TryUnique {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
        {
            //CONTOH CARA MEMBUAT DATA RANDOM UNIQUE DI JAVA
            UUID dataUnique = UUID.randomUUID();
            String data = dataUnique.toString();
            System.out.println("data unique : " + data);
        }
    }
}
