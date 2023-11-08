
// creating the electronicDevice class
class electronicDevice {
    private int deviceIDNo;
    private String brand;
    private double price;
    
    //Creating a method to set details for the electronic device
    public void setDeviceDetails(int deviceIDNo, String brand, double price) {
        this.deviceIDNo = deviceIDNo;
        this.brand = brand;
        this.price = price;
    }
    
    //Creating a method to print details of the electronic device
    public void printDeviceDetails() {
        System.out.println("Device ID: " + deviceIDNo);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " LKR");
    }
}

//Creating the Laptop class, Inheriting from electronicDevice
class Laptop extends electronicDevice {
    private String processorBrand;
    private double ramSizeGB;
    
    //Creating a method to set details for the Laptop
    public void setDeviceDetails(int deviceIDNo, String brand, double price, String processorBrand, double ramSizeGB) {
        super.setDeviceDetails(deviceIDNo, brand, price);
        this.processorBrand = processorBrand;
        this.ramSizeGB = ramSizeGB;
    }
    
     //Creating a method to print details of the Laptop, overriding the parent's method (Polymorphism)
    @Override
    public void printDeviceDetails() {
        super.printDeviceDetails();
        System.out.println("Processor brand: " + processorBrand);
        System.out.println("Ram size: " + ramSizeGB + " GB");
    }
}

//Creating the Router class, Inheriting from electronicDevice
class Router extends electronicDevice {
    private boolean wirelessCapabilityAvailable;
    private int numberOfPorts;
    
    //Creating a method to set details for the Router
    public void setDeviceDetails(int deviceIDNo, String brand, double price, boolean wirelessCapabilityAvailable, int numberOfPorts) {
        super.setDeviceDetails(deviceIDNo, brand, price);
        this.wirelessCapabilityAvailable = wirelessCapabilityAvailable;
        this.numberOfPorts = numberOfPorts;
    }
    
    //Creating a method to print details of the Router, overriding the parent's method (Polymorphism)
    @Override
    public void printDeviceDetails() {
        super.printDeviceDetails();
        System.out.println("Is wireless capability available: " + wirelessCapabilityAvailable);
        System.out.println("Number of ports: " + numberOfPorts);
    }
}


// creating s22010005 class (My online marketplace name)
public class s22010005 {
    public static void main(String[] args) {
        
        // creating a laptop object and setting details
        Laptop laptop = new Laptop();
        laptop.setDeviceDetails(10001, "Dell", 350000.0, "Intel", 16.0);
        
        // creating a router object and setting details
        Router router = new Router();
        router.setDeviceDetails(25650, "Xiomi", 8990.0, true, 4);
        
        // printing laptop details
        System.out.println("Laptop details: ");
        System.out.println("");
        laptop.printDeviceDetails();
        
        // adding some empty line 
        System.out.println("");
        System.out.println("");
        
        // printing router details
        System.out.println("Router details: ");
        System.out.println("");
        router.printDeviceDetails();
        
    }
}
