/**
 * Driver class for the shapes
 * @author Grant Elliott
 * @version 1.0
 * @since 2024-09-19
 */


import java.lang.Math;
import java.util.Scanner;

class ShapeDriver {
    public static void main(String args[]) {

        Square sq1 = new Square(1.0);
        
        System.out.printf("Side: %.2f\n", sq1.getSide());
        // Print out perimeter, area
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

        //Change the side length
        sq1.setSide(3.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

        //Change the perimeter
        sq1.setPerimeter(16.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

        //Change the area
        sq1.setArea(25.0);
        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());

            /*New Square with user inputed side length */
        //opens scanner for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Square Side Length: ");
    
        //assgins variable to entered value
        double inputSqSide = scanner.nextDouble();

        //updates area, and perimeter
        sq1.inputSide(inputSqSide);

        System.out.printf("Side: %.2f\n", sq1.getSide());
        System.out.printf("Perimeter: %.2f\n", sq1.getPerimeter());
        System.out.printf("Area: %.2f\n\n", sq1.getArea());
        
        /*Triangle Outputs */
        Triangle tri1 = new Triangle(1.0);

        System.out.println("Triangle Information");

            //prints out side,height, and area
        System.out.printf("Triangle Side: %.2f\n", tri1.getTriSide());
        System.out.printf("Triangle Height: %.2f\n", tri1.getHeight());
        System.out.printf("Triangle Area: %.2f\n\n", tri1.getTriArea());


        System.out.print("Enter Triangle Side Length: ");
    
        //assgins variable to entered value
        double inputTriangleSide = scanner.nextDouble();

        //updates area, and perimeter
        tri1.triangleSide(inputTriangleSide);

        System.out.printf("Triangle Side: %.2f\n", tri1.getTriSide());
        System.out.printf("Triangle Height: %.2f\n", tri1.getHeight());
        System.out.printf("Triangle Area: %.2f\n\n", tri1.getTriArea());

        System.out.print("Enter Triangle Height Length: ");

        //assgins variable to entered value
        double inputTriangleHeight = scanner.nextDouble();

        //updates area, and perimeter
        tri1.trianlgeHeight(inputTriangleHeight);

        System.out.printf("Triangle Side: %.2f\n", tri1.getTriSide());
        System.out.printf("Triangle Height: %.2f\n", tri1.getHeight());
        System.out.printf("Triangle Area: %.2f\n\n", tri1.getTriArea());

        System.out.print("Enter Triangle Area Length: ");

         //assgins variable to entered value
         double inputTriangleArea = scanner.nextDouble();

         //updates area, and perimeter
         tri1.triangleArea(inputTriangleArea);

        //closes scanner once finsihed
        scanner.close();

        System.out.printf("Triangle Side: %.2f\n", tri1.getTriSide());
        System.out.printf("Triangle Height: %.2f\n", tri1.getHeight());
        System.out.printf("Triangle Area: %.2f\n\n", tri1.getTriArea());
    }
}