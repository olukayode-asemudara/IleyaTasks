// START
// display "Welcome to Checkout App"
// collect customer name
// collect cashier name
// ask user for number of products purchased

// create arrays for: product names, quantities, prices

// for each product purchased; collect product name, store product name, collect quantity purchased, store quantity, collect unit price, store price

// set subtotal to 0

// for each product; calculate item total
//    item total = quantity × price
//    add item total to subtotal

// collect discount percentage
// clculate discount amount

// calculate VAT
//     VAT = 7.5% of subtotal

// calculate final amount
// final amount = subtotal - discount amount + VAT

import java.util.ArrayList;
public class CheckOutApp{
    
    static java.util.Scanner inputCollector = new java.util.Scanner(System.in);
    
    public static String getCustomerInfo(){
        System.out.println("What is the customer's name:");
        return inputCollector.nextLine();
    }
    
    public static String getCashierInfo(){
        System.out.println("What is your name:");
        return inputCollector.nextLine();
    }
    
    public static double getDiscount(double subtotal, double percentage){
        System.out.println("How much discount will he get:");
        return subtotal * percentage / 100;
    }
    
    public static double getVAT(double subtotal){
        return subtotal * 0.075;
    }
    
    
    public static double getSubtotal(int[] quantities, double[] prices) {
    
        double subtotal = 0;
    
        for(int index = 0; index < quantities.length; index++) {
            subtotal += quantities[index] * prices[index];
        }
    
        return subtotal;
    }
    
    
    public static void getProducts(String[] products, int[] quantities, double[] prices) {
    
        for(int index = 0; index < products.length; index++) {
    
            System.out.println("What did the user buy?");
            products[index] = inputCollector.nextLine();
            for(int id = 0; id < products.length; id++){
                System.out.println(products[id]);
            }
    
            System.out.println("How many pieces?");
            quantities[index] = inputCollector.nextInt();
    
            System.out.println("How much per unit?");
            prices[index] = inputCollector.nextDouble();
        }
    }
    
    public static double getCustomerAmount(double amount){        
            System.out.println("How much did customer pay?");
            return inputCollector.nextDouble();
    }
        

    public static void main(String[] args) {
    
        // I'm using ArrayList since my array doesn't have a fixed size upfront
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        
        String customerName = getCustomerInfo();
        
        String addMore = "yes";
        while(addMore.equalsIgnoreCase("yes")){
            System.out.println("What did the user buy?");
            products.add(inputCollector.nextLine());

            System.out.println("How many pieces?");
            quantities.add(inputCollector.nextInt());

            System.out.println("How much per unit?");
            prices.add(inputCollector.nextDouble());

            // This prevents Scanner issues when switching back to collect strings
            // Exception in thread "main" java.util.InputMismatchException
            inputCollector.nextLine();

            System.out.println("Add more Items? ");
            addMore = inputCollector.nextLine();
        }
        
        System.out.print("What is your name?\n");
        String cashierName = inputCollector.nextLine();

        System.out.print("How much discount will he get\n");
        double discountPercentage = inputCollector.nextDouble();

        // Convert ArrayLists to arrays for your existing methods
        int[] quantityArray = new int[quantities.size()];
        double[] priceArray = new double[prices.size()];

        for(int index = 0; index < quantities.size(); index++){
            quantityArray[index] = quantities.get(index);
            priceArray[index] = prices.get(index);
        }

        double subtotal = getSubtotal(quantityArray, priceArray);
        double discount = getDiscount(subtotal, discountPercentage);
        double vat = getVAT(subtotal);
        double finalAmount = subtotal - discount + vat;
        double moneyReceived = inputCollector.nextDouble();
        getCustomerAmount(moneyReceived);
        
        
        String header = """
                
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
                TEL: 03293828343
                Date: 18-Dec-22 8:48:11pm
                Cashier: %s
                Customer Name: %s

                ==========================================================
                                    ITEM    QTY   PRICE         TOTAL(NGN)
                ----------------------------------------------------------

                """;

        System.out.printf(header, cashierName, customerName);
        
        for(int index = 0; index < products.size(); index++){
            System.out.printf("%-30s %3d %8.2f %12.2f\n", 
                products.get(index), 
                quantities.get(index), 
                prices.get(index), 
                quantities.get(index) * prices.get(index));
        }
        
        System.out.printf("""
        
----------------------------------------------------------
        """);
        
       System.out.printf("""

                            Sub Total:          %.2f
                             Discount:          %.2f
                         VAT @ 7.50%%:          %.2f
==========================================================
                           Bill Total:          %.2f
==========================================================
THIS IS NOT AN RECEIPT KINDLY PAY %.2f
==========================================================



How much did the customer give to you?

%.2f

        """, subtotal, discount, vat, finalAmount, finalAmount, moneyReceived);
        
        }
}
