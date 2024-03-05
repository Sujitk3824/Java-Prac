import java.util.Scanner;

public class PracticalNo3 {
    // Method to calculate volume of a cube
    public static double calculateVolume(Integer sideLength) {
        return Math.pow(sideLength, 3);
    }

    // Method to calculate volume of a cylinder
    public static double calculateVolume(Integer radius, Integer height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Method to calculate volume of a box
    public static double calculateVolume(Integer length, Integer width, Integer height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For Cube
        System.out.print("Enter side length of the cube: ");
        Integer sideLength = scanner.nextInt();
        System.out.println("Volume of the cube: " + calculateVolume(sideLength));

        // For Cylinder
        System.out.print("Enter radius of the cylinder: ");
        Integer radius = scanner.nextInt();
        System.out.print("Enter height of the cylinder: ");
        Integer height = scanner.nextInt();
        System.out.println("Volume of the cylinder: " + calculateVolume(radius, height));

        // For Box
        System.out.print("Enter length of the box: ");
        Integer length = scanner.nextInt();
        System.out.print("Enter width of the box: ");
        Integer width = scanner.nextInt();
        System.out.print("Enter height of the box: ");
        Integer boxHeight = scanner.nextInt();
        System.out.println("Volume of the box: " + calculateVolume(length, width, boxHeight));

        scanner.close();
    }
}
