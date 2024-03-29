/*MenuItemFactory.java
Factory for Item
Author: Nikitha Mbokotwana (218337906)
Date: 08 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.MenuItem;
import za.ac.cput.util.Auth;

public class MenuItemFactory {

    //Creating item object
    public static MenuItem createMenuItem(String itemID, String menuCategory, String itemName,double itemPrice){

        if (Auth.isNullorEmpty(itemID))
        {
            return null;
        }
        return new MenuItem.Builder().setItemID(itemID)
                .setItemName(itemName)
                .setItemPrice(itemPrice)
                .setMenuCategory(menuCategory)
                .build();
    }
}
