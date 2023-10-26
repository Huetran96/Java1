package TestJava1;

public class LineItem {
    public Product product;
    public int lineQuantity;
    public LineItem(Product product, int lineQuantity){
        this.product = product;
        this.lineQuantity = lineQuantity
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return product;
    }

    public void setLineQuantity(int lineqQuantity){
        this.lineQuantity = lineqQuantity;
    }
    public int getLineQuantity(){
        return lineQuantity;
    }


    public double cost(){
        return product.getPrice()*lineQuantity;
    }
    @Override
    public String toString() {
        return "LineItem:\n" + product.toString() + "\nQuantity: " + lineQuantity + "\nTotal Cost: " + cost();
    }
}
