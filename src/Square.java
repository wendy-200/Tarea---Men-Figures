public class Square {
    public static void printSquare(int Size) {
        for (int i = 1; i < Size; i++) {
            for (int j = 1; j <Size; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
