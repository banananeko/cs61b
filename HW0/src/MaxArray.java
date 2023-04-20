// create a function with the signature public static int max(int[] m) that returns the maximum value of an int array.
// You can assume that the array is non-empty and that all the numbers are positive.
public class MaxArray {
    public static int max(int[] m) {
        int max = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
