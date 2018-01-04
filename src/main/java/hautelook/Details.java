package hautelook;

public class Details {
  int price = 0;
  int quantity = 0;
  int weight = 0;

  public void incrementQuantity() {
    quantity++;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getWeight() {
    return weight;
  }

  public Details (int itemPrice, int itemQuantity, int itemWeight) {
    price = itemPrice;
    quantity = itemQuantity;
    weight = itemWeight;
  }
}
