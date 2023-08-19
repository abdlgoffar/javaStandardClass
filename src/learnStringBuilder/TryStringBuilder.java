package learnStringBuilder;

public class TryStringBuilder {
    public static void main(String[] args) {
        //STRING BUILDER DIGUNAKAN UNTUK MEMBUAT PENGHEMATAN MEMORY PENYIMPANAN DI JAVA, AGAR APPLIKASI OPTIMAL
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abdul");
        stringBuilder.append(" ");
        stringBuilder.append("goffar");
        String name = stringBuilder.toString();
        System.out.println(name);
    }
}
