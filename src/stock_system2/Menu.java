package stock_system2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private StockList stockList = new StockList();
    private ArrayList<String> stock = new ArrayList<String>();

    private boolean exit = false;

    public void getData() {
        ArrayList<Stock> stocks = new ArrayList<Stock>();
        stocks = StockList.getStock(stocks.readFile(StockList.stockFile));
        while (!exit)
            printMenu();
    }

    public void printMenu() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print menu options");
        System.out.println("\t 1 - To print the stock list");
        System.out.println("\t 2 - To add stock to the stock list");
        System.out.println("\t 3 - To modify an item in the stock list");
        System.out.println("\t 4 - To remove items from the stock list");
        System.out.println("\t 5 - To search for an item in the stock list");
        System.out.println("\t 6 - To change an account password");
        System.out.println("\t 7 - To quit the application");
        System.out.println(" ");
    }

    public void addStock() {
        System.out.print("Please enter the stock item: ");
        stockList.addStock(scanner.nextLine());
    }

    public void modifyStock() {
        System.out.print("Enter product ID: ");
        int stockID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement stock ID: ");
        String newStock = scanner.next();
        stockList.modifyStock(stockID-1, newStock);
    }

    public void removeStock() {
        System.out.print("Enter product ID: ");
        int stockID = scanner.nextInt();
        scanner.nextLine();
        stockList.removeStock(stockID-1);
    }

    public void searchStock() {
        System.out.println("Enter stock search: ");
        String searchStock = scanner.nextLine();
        if(stockList.findStock(searchStock) !=null) {
            System.out.println("Found" + searchStock + " in our stock system");
        } else {
            System.out.println(searchStock + " is not in the stock system");
        }
    }


}
