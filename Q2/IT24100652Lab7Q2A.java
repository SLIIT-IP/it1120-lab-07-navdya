public class IT24100652Lab7Q2A {
    public static void main(String[] args) {
        // Number of rows and columns
        int rows = 5;
        int cols = 5;

        // Loop through rows
        for (int i = 0; i < rows; i++) {
            // Loop through columns
            for (int j = 0; j < cols; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
