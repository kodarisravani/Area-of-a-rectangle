import java.util.Scanner;

public class AreaofaRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length (integer): ");
        int lengthInt = scanner.nextInt();
        System.out.print("Enter width (integer): ");
        int widthInt = scanner.nextInt();
        int areaInt = lengthInt * widthInt;
        System.out.println("Area (integer): " + areaInt);
        System.out.print("Enter length (float): ");
        float lengthFloat = scanner.nextFloat();
        System.out.print("Enter width (float): ");
        float widthFloat = scanner.nextFloat();
        float areaFloat = lengthFloat * widthFloat;
        System.out.println("Area (float): " + areaFloat);
        scanner.close();
    }
}
