public class IT24100652Lab7Q2B {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the number
            System.out.print(i + " - ");
            // Loop to print stars corresponding to the number
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each number and stars
            System.out.println();
        }
    }
}

