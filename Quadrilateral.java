// Creating a class to represent Quadrilateral shape
public class Quadrilateral {
    
    // Creating instance variables to represent each side
    private double side1;  // Legnth of side1
    private double side2;  // Legnth of side2
    private double side3;  // Legnth of side2
    private double side4;  // Legnth of side3
    
    
    // Creating a constructor to take arguments 
    public Quadrilateral(double side1, double side2, double side3, double side4) {
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
    
    // Creating a method to calculate the perimeter of Quadrilateral
    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }
    
    
    // Creating a method called toString() to return string representation of Quadrilateral 
    public String toString() {
        
        return "Quadrilateral : side1 = " + side1 + "; side2 = " + side2 + "; side3 = " + side3 + "; side4 = " + side4 + "; Perimeter = " + getPerimeter() + ";";
  
  
    }
    public static void main(String[] args) { 
        
        // Creating a Quadrilateral object with values
        Quadrilateral quadrilateral = new Quadrilateral(10.0, 11.5, 6.0, 13.5);
        
        
        // Print string representation of Quadrilateral
        System.out.println(quadrilateral.toString());
    }
}

