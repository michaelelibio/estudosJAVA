public class Main{
    public static void main(String [] args){
        int inteiro = 50;
        double decimal = 1.506048;

        System.out.println(inteiro);
        System.out.println(decimal);
        System.out.printf("%.1f%n", decimal);
        System.out.printf("%.2f%n", decimal);
        System.out.printf("%.3f%n", decimal);
        System.out.printf("%.4f%n", decimal);

        System.out.println("int = " + inteiro + ", DOUBLE " + decimal);
    }
}