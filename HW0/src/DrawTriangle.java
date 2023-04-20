public class DrawTriangle {
    public static void draw(int n) {
        int col = 0;
        int row = 0;
        while (row < n) {
            while (col < row + 1) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            col = 0;
        }
    }

    public static void main(String[] args)
    {
        draw(10);
    }
}
