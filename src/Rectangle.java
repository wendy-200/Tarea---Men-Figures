public class Rectangulo {
    public static void main(String[] args) {
        printRectangle(3,7);
    }
    public static void printRectangle(int altura, int ancho) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <ancho ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
