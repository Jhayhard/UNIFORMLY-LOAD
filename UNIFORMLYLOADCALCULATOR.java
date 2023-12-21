
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class UNIFORMLYLOADCALCULATOR {
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             boolean exitProgram = false;
             
             do {
                 System.out.println("\nChoose the type of load:");
                 System.out.println("1. Rectangular Load");
                 System.out.println("2. Triangular Load");
                 System.out.println("3. Exit");
                 
                 System.out.print("Enter your choice (1, 2, or 3): ");
                 int loadType = scanner.nextInt();
                 
                 switch (loadType) {
                     case 1 -> calculateRectangularLoadReactions(scanner);
                     case 2 -> calculateTriangularLoadReactions(scanner);
                     case 3 -> exitProgram = true;
                     default -> System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                 }
                 
             } while (!exitProgram);
             
             System.out.println("Exiting the program.");
         }
    }

    private static void calculateRectangularLoadReactions(Scanner scanner) {
        System.out.print("Enter the magnitude of the rectangular load (in kN/m): ");
        double rectangularLoadMagnitude = scanner.nextDouble();

        System.out.print("Enter the length of the rectangular load (in meters): ");
        double rectangularLoadLength = scanner.nextDouble();

        // Calculate reactions for rectangular load
        double reactionAtLeftSupport = (rectangularLoadMagnitude * rectangularLoadLength) / 2;
        double reactionAtRightSupport = reactionAtLeftSupport;

        // Output the results
        System.out.println("\nReactions for Rectangular Load:");
        System.out.println("Reaction at Left Support: " + reactionAtLeftSupport + " kN");
        System.out.println("Reaction at Right Support: " + reactionAtRightSupport + " kN");
    }

    private static void calculateTriangularLoadReactions(Scanner scanner) {
        System.out.print("Enter the magnitude of the triangular load (in kN/m): ");
        double triangularLoadMagnitude = scanner.nextDouble();

        System.out.print("Enter the length of the triangular load (in meters): ");
        double triangularLoadLength = scanner.nextDouble();

        // Calculate reactions for triangular load
        double reactionAtLeftSupport = (triangularLoadMagnitude * triangularLoadLength) / 6;
        double reactionAtRightSupport = reactionAtLeftSupport * 2;

        // Output the results
        System.out.println("\nReactions for Triangular Load:");
        System.out.println("Reaction at Left Support: " + reactionAtLeftSupport + " kN");
        System.out.println("Reaction at Right Support: " + reactionAtRightSupport + " kN");
    }
}
}
