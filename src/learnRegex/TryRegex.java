package learnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TryRegex {
    public static void main(String[] args) {
        String data = "goffar sedang pergi ke pasar bersama ibunya dan bapaknya";

        //MEMBUAT REGEX CHAR
        Pattern paternData = Pattern.compile("[a-zA-z]*[a][a-zA-Z]");//KURUNG SIKU KE-1 SYARAT KALIMAT BAGIAN PERTAMA,
        //KURUNG SIKU KE-2 SYARAT KALIMAT BAGIAN TENGAH, KURUNG SIKU KE-3 SYARAT KALIMAT BAGIAN TERAKHIR,,
        Matcher matcherData = paternData.matcher(data);
        //MENGETAHU KALIMAT YANG MATCH ATAU TERSEDIA SESUAI REGEX CHAR
        while (matcherData.find())
        {
            System.out.println(matcherData.group());
        }
    }
}
