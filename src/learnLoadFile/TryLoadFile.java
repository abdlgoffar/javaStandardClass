package learnLoadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TryLoadFile {

    public static void main(String[] args) {
        //CARA LOAD DATA DARI FILE.PROPERTIES
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("data.properties"));//NAMA FILE.PROPERTIES
            String server = properties.getProperty("database.servername");//NAMA VARIABLE YANG DATANYA INGIN DIAMBIL
            System.out.println(server);
        }catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }catch (IOException exception) {
            System.out.println(exception.getMessage());
        }




        //CARA SAVE DATA KE FILE.PROPERTIES
        try {
            Properties properties = new Properties();
            //PARAMETER PERTAMA ADALAH NAMA VARIABLE, PARAMETER KEDUA VALUENYA
            properties.put("name", "abdul goffar");
            properties.put("name", "abdul goffar");
            properties.put("address", "maduras-east java-indonesian");

            //FILE.PROPERTIES TUJUAN
            properties.store(new FileOutputStream("data2.properties"), "name admin");
        }catch (FileNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }catch (IOException exception)
        {
            System.out.println(exception.getMessage());
        }


    }
}
