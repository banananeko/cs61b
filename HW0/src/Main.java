/* use a function called drawTriangle and it takes only one argument n -
print out a triangle of asterisks 5 rows, the first row has 1 asterisk, the second row has 2 asterisks, and so on
 */
public class Main {

    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int SIZE = 5;
        while (row < SIZE) {
            while (col < row + 1) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            col = 0;
        }
    }
}
