public class OrderItem {
    Product product;
    int quantity;


    OrderItem(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double subtotal()
    {
        return product.finalPrice(this.quantity);
    }
}
