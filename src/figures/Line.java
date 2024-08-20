package figures;

public class Line {
    private int length;

    public Line() {
    }

    public Line(int length) {
        this.length = length;
    }

    public static void printLine(int lineSize) {
    }

    public void printLine(){
        System.out.println("----------------- Printing Line (" +  length  +")----------------");
        System.out.println(" ");
        for(int i = 0; i < length; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
