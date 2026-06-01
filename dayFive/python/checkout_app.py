# // START
# // display "Welcome to Checkout App"
# // collect customer name
# // collect cashier name
# // ask user for number of products purchased

# // create arrays for: product names, quantities, prices

# // for each product purchased; collect product name, store product name, collect quantity purchased, store quantity, collect unit price, store price

# // set subtotal to 0

# // for each product; calculate item total
# //    item total = quantity × price
# //    add item total to subtotal

# // collect discount percentage
# // clculate discount amount

# // calculate VAT
# //     VAT = 7.5% of subtotal

# // calculate final amount
# // final amount = subtotal - discount amount + VAT
    
def getCustomerInfo:
    return input("What is your customer's name? ");

def getCashierInfo =()=>{
    return input("What is your name? ");

def getDiscount(subtotal,  percentage):
    return subtotal * percentage / 100;

def getVAT(subtotal):
    return subtotal * 0.075;

products = [];
quantities = [];
prices = [];
    
def getSubtotal(quantities,prices):
    subtotal = 0;
    for(index = 0; index < quantities.length; index++):
        subtotal += quantities[index] * prices[index];
    
    return subtotal;

    
    
for(index = 0; index < products.length; index++):
    products[index] = input("What did the user buy? "):
    for( id = 0; id < products.length; id++){
        print(products[id]);
    
    quantities[index] = input("How many pieces? ");  
    prices[index] = input("How much per unit? ");
    
def getCustomerAmount():
    return input("How much did user pay? ");

        
customerName = getCustomerInfo();

addMore = "yes";
while (addMore.toLowerCase() === "yes"):
    products.push(input("What did the user buy? "));

    quantities.push(input("How many pieces? "));

    prices.push(input("How much per unit? "));
            
    addMore = input("Add more Items? ");

cashierName = getCashierInfo();

discountPercentage = input("How much discount will he get? ");

moneyReceived = getCustomerAmount();

subtotal = getSubtotal(quantities, prices);
discount = getDiscount(subtotal, discountPercentage);
vat = getVAT(subtotal);
finalAmount = subtotal - discount + vat;
         

for (let index = 0; index < products.length; index++):
    print(`${products[index]} ${quantities[index]} ${prices[index]} ${(quantities[index] * prices[index])}`);
            
    print(`
                
    SEMICOLON STORES
    MAIN BRANCH
    LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
    TEL: 03293828343
    Date: 18-Dec-22 8:48:11pm
    Cashier: ${cashierName}
    Customer Name: ${customerName}

    ==========================================================
                        ITEM    QTY   PRICE         TOTAL(NGN)
    ----------------------------------------------------------

    `)
    
        
    print(`
    -------------------------------------------------------------------------
                                Sub Total:          ${subtotal.toFixed(2)}
                                 Discount:          ${discount.toFixed(2)}
                             VAT @ 7.50%:          ${vat.toFixed(2)}
    =========================================================================
                               Bill Total:          ${finalAmount.toFixed(2)}
    =========================================================================
    THIS IS NOT A RECEIPT. KINDLY PAY ${finalAmount.toFixed(2)}
    =========================================================================

    How much did the customer give to you?

    ${moneyReceived}
    `);
