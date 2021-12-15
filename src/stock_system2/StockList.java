package stock_system2;

import java.util.ArrayList;
import java.io.*;

public class StockList {

    StockList stockList = new StockList();
    static File stockFile = new File("C:/Users/CandleLaptop/Desktop/StockList.txt");

    public void createFileIfNone(){
        try {
            if (!stockFile.isFile()) {
                stockFile.createNewFile();
            }
        }
        catch(IOException ioEx){
            System.out.println("Error creating Stock File");
            ioEx.printStackTrace();
        }
    }

    public void writeData(ArrayList<Stock> stocks) {
        try {
            FileWriter writer = new FileWriter(stockFile);

            for (Stock s : stocks) {
                writer.write(s.stockID + "," + s.stockManufacturer + "," + s.stockName
                        + "," + s.stockPrice + "," + s.stockAvailability);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException ioex) {
            System.out.println("Failed to write to file");
            ioex.printStackTrace();
        }
    }

    public ArrayList<String> readFile(File file) {
        createFileIfNone();
        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader breader = new BufferedReader(reader);
            String line;
            while ((line = breader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        }
        catch (IOException ioEx) {
            System.out.println("Error reading file");
            ioEx.printStackTrace();
        }
        return lines;
    }

    public ArrayList<Stock> getStock(ArrayList<String> stockStrings) {
        ArrayList<Stock> stocks = new ArrayList<>();
        for (String str: stockStrings) {
            stocks.add(getStockFromString(str));
        }
        return stocks;
    }

    public Stock getStockFromString(String stockString) {
        String[] pd = stockString.split(",");
        Stock stock = new Stock(Integer.parseInt(pd[0]), pd[1], pd[2], Double.parseDouble(pd[3]), Integer.parseInt(pd[4]));
        return stock;
    }




}
