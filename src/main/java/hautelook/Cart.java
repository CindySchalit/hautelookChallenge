package hautelook;
import java.util.*;

/**
 * Created by bill on 4/10/17.
 */

public class Cart {
  //declare variables
  double totalBeforeTax = 0.0;
  HashMap<String, PriceQuantity> myCart = new HashMap<String, PriceQuantity>();
  boolean discountApplied = false;
  int discount = 0;

  // define methods
  public double subtotal() {
    return totalBeforeTax;
  }

  public void addItem(String name, int price) {
    // item not in cart
    if ( !myCart.containsKey(name) ) {
      // create item and add to cart
      PriceQuantity newItemDetails = new PriceQuantity(price, 1);
      myCart.put(name, newItemDetails);
    }

    // item already in cart
    else {
      myCart.get(name).incrementQuantity();
    }

    if (discountApplied) {
      totalBeforeTax += price * (1 - discount * 0.01);
    } else { // no discount
      totalBeforeTax += price;
    }
  }

  public void applyDiscount(int percent) {
    discountApplied = true;
    discount = percent;

    totalBeforeTax = totalBeforeTax * (1 - discount * 0.01);
  }
}
