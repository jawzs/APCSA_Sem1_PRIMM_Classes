/**
 * Implements a class that encapsulates data and methods for representing a equilateral triangle
 * @author Grant Elliott
 * @version 1.0
 * @since 2024-09-19
 */


public class Triangle {
        /** The side length of the equilateral triangle **/
    private double side = 1.0;

        /** The hight of the trianlge **/
    private double height = .87;

        /** The area of the square **/
    private double area = .43;
    
    /**
     * Constructor
     * @param side double representing the side length. Assumes positive non-zero 
     */
    public Triangle(double s) {
        side = s;
        height = (Math.sqrt(3.0)/2.0) * side;
        area = (side * height)/2.0;
    }

     /**
     * Gets side length
     * @return double representing side
     */
    public double getTriSide() {
        return side;
    }

     /**
     * Gets height length
     * @return double representing height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets area
     * @return double representing area
     */
    public double getTriArea() {
        return area;
    }

    public void setTriangleSide(double s) {
        side = s;
        height = (Math.sqrt(3.0)/2.0) * side;
        area = (side * height)/2.0;
    }

    public void setTriangleHeight(double h) {
        height = h;
        side = (2.0 * height)/Math.sqrt(3.0);
        area = (side * height)/2.0;
    }

    public void setTriangleArea(double a) {
        area = a;
        side = Math.sqrt((4.0 * area)/Math.sqrt(3.0));
        height = (Math.sqrt(3.0)/2.0) * side;
    }
}
