] args) {

        Laptop laptop = new Laptop();
        laptop.setLaptopDetails(10001, "Dell", 350000.00, "Intel", 16.0);

        Router router = new Router();
        router.setRouterDetails(25650, "Xiomi", 8990.00, true, 4);

        System.out.println("Laptop details: ");

        laptop.printDeviceDetails();

        System.out.println("Router details: ");

        router.printDeviceDetails();

    }
}
