import figures.Line;
import figures.Rectangle;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("Enter Line");
            System.out.println("Enter Square");
            System.out.println("Enter Rectangle");
            System.out.println("Exit");

            System.out.print("select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the Line size: ");
                    int LineSize = scanner.nextInt();
                    Line.printLine(LineSize);
                    break;
                case 2:
                    System.out.print("Enter the size of the Square: ");
                    int SizeSquare = scanner.nextInt();
                    Square.printSquare(SizeSquare);
                    break;
                case 3:
                    System.out.print("Enter the height of the rectangle: ");
                    int HeightRectangle = scanner.nextInt();
                    System.out.print("Enter the width of the rectangle: ");
                    int WidthRectangle = scanner.nextInt();
                    Rectangle.printRectangle(HeightRectangle,WidthRectangle);
                case 4:
                    System.out.println("Exit");
                    return;

            }
        }
    }
}

