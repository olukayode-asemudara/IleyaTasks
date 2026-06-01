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
    
    const prompt = require("prompt-sync")()
    
    const getCustomerInfo =()=>{
        return prompt("What is your customer's name? ");
    }

    const getCashierInfo =()=>{
        return prompt("What is your name? ");
    }
    
    const getDiscount =(subtotal,  percentage)=>{
        return subtotal * percentage / 100;
    }
    
    const getVAT =(subtotal)=>{
        return subtotal * 0.075;
    }

    const products = [];
    const quantities = [];
    const prices = [];
    
    const getSubtotal =(quantities,prices)=> {
         subtotal = 0;
        for(index = 0; index < quantities.length; index++) {
            subtotal += quantities[index] * prices[index];
        }
    
        return subtotal;
    }
    
    
        for(index = 0; index < products.length; index++) {
            products[index] = prompt("What did the user buy? ");
            for( id = 0; id < products.length; id++){
               console.log(products[id]);
            }
    
            quantities[index] = prompt("How many pieces? ");  
            prices[index] = prompt("How much per unit? ");
        }
    
    const getCustomerAmount =()=>{
            return prompt("How much did user pay? ");
    }
        
    let customerName = getCustomerInfo();

        let addMore = "yes";
    while (addMore.toLowerCase() === "yes") {
            products.push(prompt("What did the user buy? "));

            quantities.push(prompt("How many pieces? "));

            prices.push(prompt("How much per unit? "));
            
            // consume newline
            // inputCollector.nextLine();
            
            addMore = prompt("Add more Items? ");
        }

        let cashierName = getCashierInfo();

         discountPercentage = prompt("How much discount will he get? ");

         moneyReceived = getCustomerAmount();

         subtotal = getSubtotal(quantities, prices);
         discount = getDiscount(subtotal, discountPercentage);
         vat = getVAT(subtotal);
         finalAmount = subtotal - discount + vat;
         
        
    for (let index = 0; index < products.length; index++) {
        console.log(
            `${products[index]} ${quantities[index]} ${prices[index].toFixed(2)} ${(quantities[index] * prices[index]).toFixed(2)}`
        );
    }
            
    console.log(`
                
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
    
        
    console.log(`
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

    ${moneyReceived.toFixed(2)}
    `);
