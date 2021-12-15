package stock_system2;

public class Stock {

    public int stockID;
    public String stockManufacturer;
    public String stockName;
    public double stockPrice;
    public int stockAvailability;


    //Constructor
    public Stock(int stockID, String stockManufacturer, String stockName, double stockPrice, int stockAvailability) {
        this.stockID = stockID;
        this.stockManufacturer = stockManufacturer;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockAvailability = stockAvailability;
    }
}
