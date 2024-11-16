public class LoopShape {

    // Method to create a rectangle with given width and height
    public static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Dimensions must be at least 1.");
            return;
        }

        // Loop through the height
        for (int i = 0; i < height; i++) {
            // Print a line of '#' of length 'width'
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            // Move to the next line after printing one row of the rectangle
            System.out.println();
        }
    }

    // Method to create an isosceles right triangle with given size
    public static void createTriangle(int size) {
        if (size < 1) {
            System.out.println("Size must be at least 1.");
            return;
        }

        // Loop through the size of the triangle (1 to size)
        for (int i = 1; i <= size; i++) {
            // Print 'i' number of '#' characters for the current row
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            // Move to the next line after printing one row of the triangle
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test the createRectangle and createTriangle methods
        System.out.println("Rectangle (5x4):");
        createRectangle(5, 4);  // Rectangle with width 5 and height 4
        System.out.println();

        System.out.println("Rectangle (1x1):");
        createRectangle(1, 1);  // Rectangle with width 1 and height 1
        System.out.println();

        System.out.println("Triangle (5):");
        createTriangle(5);  // Triangle with size 5
        System.out.println();

        System.out.println("Triangle (1):");
        createTriangle(1);  // Triangle with size 1
        System.out.println();
    }
}
