public class test {
    public static void main(String[] args) {
        // Create the stock market (subject)
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.75);
        stockMarket.setStockPrice(155.30);

        // Deregister an observer and change stock price again
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice(160.00);
    }
}
