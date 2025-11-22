public class NepalFlag {
    public static void main(String[] args) {
        int height = 15; // Height of the flag

        // Upper triangle (main part)
        for (int i = 0; i < height / 2; i++) {
            // Left spacing
            for (int j = 0; j < height / 2 - i; j++) {
                System.out.print(" ");
            }

            // Stars for upper triangle
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for (int i = 0; i < height / 2; i++) {
            // Left spacing
            for (int j = 0; j < height / 2 - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars for lower triangle
            for (int j = 0; j < 2 * i + 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Flag pole
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}