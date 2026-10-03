import java.util.Scanner;
public class WasteCollection3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of waste collected in kg: ");
        double wasteCollected = sc.nextDouble();

        if (wasteCollected >= 100) 
            System.out.println("Collection Target Achieved");
         else 
            System.out.println("More Waste Collection Required");
        

        sc.close();
    }
}
