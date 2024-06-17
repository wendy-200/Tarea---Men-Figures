public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Rectángulo de alto 3 y ancho 4:");
        printRectangle(3, 4);
        System.out.println("\nRectángulo de alto 5 y ancho 6:");
        printRectangle(5, 6);
    }

    public static void printRectangle(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
