package hautelook;

public class Details {
  int price = 0;
  int quantity = 0;
  int weight = 0;

  public Details (int itemPrice, int itemQuantity, int itemWeight) {
    price = itemPrice;
    quantity = itemQuantity;
    weight = itemWeight;
  }

  public void incrementQuantity() {
    quantity++;
  }
}
