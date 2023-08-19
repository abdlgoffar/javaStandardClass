package learnEncodeData64;

import java.util.Base64;

public class TryEncode {
    public static void main(String[] args) {
        String name = "abdul goffar pliyang sampang";
        //ENCODE DATA
        String dataNameEncode = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("data name setelah di encode : " + dataNameEncode);
        //DECODE DATA
        byte[]  dataByte = Base64.getDecoder().decode(dataNameEncode);
        String dataNameDecode = new String(dataByte);
        System.out.println(dataNameDecode);
    }
}
