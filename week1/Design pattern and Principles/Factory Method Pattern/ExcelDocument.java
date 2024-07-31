public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel Document.");
    }
}
