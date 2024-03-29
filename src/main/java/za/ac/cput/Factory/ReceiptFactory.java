/**ReceiptFactory.java
 * Factory class for Receipt
 * Author: Nikitha Mbokotwana (218337906)
 * Date: 08 April 2022
 **/
package za.ac.cput.Factory;

import za.ac.cput.Entity.*;
import za.ac.cput.util.Auth;

public class ReceiptFactory {
    //Creating a Receipt object
    public static Receipt createReceipt(String receiptID, Orders orderID, Customer custID, Driver driverID, MenuItem itemID){
        if(Auth.isNullorEmpty(receiptID))
            return null;

        return new Receipt.Builder()
                .setReceiptID(receiptID)
                .setOrder(orderID)
                .setCustID(custID)
                .setDriverID(driverID)
                .setItemID(itemID)
                .build();
    }

}
