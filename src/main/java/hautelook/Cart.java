package hautelook;
import java.util.*;

/**
 * Created by bill on 4/10/17.
 */

public class Cart {
  //declare variables
  double totalBeforeTax = 0.0;
  HashMap<String, Details> myCart = new HashMap<String, Details>();
  boolean discountApplied = false;
  int discount = 0;
  int totalWeight = 0;

  // define methods
  public double subtotal() {
    return totalBeforeTax;
  }

  public void addItem(String name, int price, int weight) {
    // item not in cart
    if ( !myCart.containsKey(name) ) {
      // create item and add to cart
      Details newItemDetails = new Details(price, 1, weight);
      myCart.put(name, newItemDetails);
    } else { // item already in cart
      myCart.get(name).incrementQuantity();
    }

    // increase total weight
    totalWeight += myCart.get(name).getWeight();

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
