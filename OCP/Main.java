public class Main {
    public static void main(String[] args) {
        SmartphoneFactory smartphoneFactory = new SmartphoneFactory();
        LaptopFactory laptopFactory = new LaptopFactory();

        Device smartphone = smartphoneFactory.createDevice();
        Device laptop = laptopFactory.createDevice();

        smartphone.displayDetails();
        laptop.displayDetails();
    }
}