public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "16GB", "512GB SSD")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(true)
                .build();

        Computer budgetComputer = new Computer.Builder("Intel i3", "8GB", "256GB SSD")
                .setGraphicsCardEnabled(false)
                .setBluetoothEnabled(false)
                .build();

        // Print the configurations
        System.out.println(gamingComputer);
        System.out.println(officeComputer);
        System.out.println(budgetComputer);
    }
}
