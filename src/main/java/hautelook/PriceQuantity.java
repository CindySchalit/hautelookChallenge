package hautelook;

public class PriceQuantity {
  int price = 0;
  int quantity = 0;

  public void incrementQuantity() {
    quantity++;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public PriceQuantity (int itemPrice, int itemQuantity) {
    price = itemPrice;
    quantity = itemQuantity;
  }
}
