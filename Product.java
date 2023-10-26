package TestJava1;

public class Product {
    String sku,name,category;
    float price;
    public int quantity;
    public Product(String sku, String name, String category, float price, int quantity){
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku=sku;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
      return String.format("Sku: %s\nName: %s\n category: %s\n Price: %.2f\nQuantity: %d",sku,name,category,price,quantity);
    }


}
