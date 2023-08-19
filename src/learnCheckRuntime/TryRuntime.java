package learnCheckRuntime;

public class TryRuntime {


    public static void main(String[] args) {
        Runtime chekRuntime = Runtime.getRuntime();
        System.out.println("chek memory cpu tersedia: " + chekRuntime.availableProcessors());
        System.out.println("chek memory bebas di jvm: " + chekRuntime.freeMemory());
        System.out.println("chek memory total di jvm: " + chekRuntime.totalMemory());
        System.out.println("chek memory maximum si jvm: " + chekRuntime.maxMemory());
    }
}
