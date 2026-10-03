import java.util.Scanner;
public class WasteCollection3c {
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount of waste collected at Collection Point 1 in kg: ");
        double wastePoint1 = sc.nextDouble();

        System.out.print("Enter the total amount of waste collected at Collection Point 2 in kg: ");
        double wastePoint2 = sc.nextDouble();

        double totalWaste = calculateTotalWaste(wastePoint1, wastePoint2);

        System.out.println("The total waste collected is: " + totalWaste + " kg");

        sc.close();
    }
}
