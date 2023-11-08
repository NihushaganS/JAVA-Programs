
import java.util.Scanner; 


public class allowance {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Employee ID: "); // Asking the user to enter Employee Id
        String empID = scanner.nextLine(); // storing Employee Id as empID
        
        System.out.println("Enter the Employee Name: "); // Asking the user to enter Employee Name
        String empName = scanner.nextLine(); // storing Employee Name as empName
        
        System.out.println("Enter the Employee Salary: "); // Asking the user to enter Employee Salary
        double empSalary = scanner.nextDouble(); // storing Employee Salary as empSalary
        scanner.nextLine(); // to avoid enter key confusions
        
        System.out.println("Enter the distance to office from Employee's home (Km) : "); // Asking the user to Enter the distance to office from Employee's home in Kilo Meters
        double empHomeKM = scanner.nextDouble(); // storing distance as empHomeKM
        scanner.nextLine(); // to avoid enter key confusions
         
        
        double certainDistance = 22; //Registration number is 222517415
        double centainPercentage = 0.05; // Student number is s22010005 so 5/100=0.05
        double finalSal; //Declaring Variable for Final Salary
        
        System.out.println("\nProcessing..."); // to make my program looks good
        if (empHomeKM > certainDistance){     //If distance to office from Employee's home is grater than certain distance
            finalSal = empSalary + empSalary*centainPercentage; // Travel allowance will be added to the Final Salary
        }
        else {   // If distance to office from Employee's home is less than or equal to certain distance
            finalSal = empSalary; // Travel allowance will be 0 and final salary is same as employee salary
        }
        
        System.out.println("Final Salary of " + " Mr./Ms. " + empName + " \"Employee ID (" +empID + ")\" is Rs." + finalSal ); 
        // Displaying the Final Salary of the Employee with employee ID and Employee Name
        
    }
}
