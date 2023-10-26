package TestJava1;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    String customerName;
    Date transactionTime;

    ArrayList<LineItem> lineItemArrayList = new ArrayList<>();
    public Order(){

    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }
    public void setTransactionTime(Date transactionTime){
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime(){
        return transactionTime;
    }

    public void addProduct(Product product,int quantity){
        try {
            if (quantity<= product.quantity){
                LineItem line = new LineItem(product,quantity);
                lineItemArrayList.add(line);
        }
            else throw new Exception();

        }catch (Exception e){
            System.out.println("Not enougt quantity");

        }
    }
    public double costOrder(){
        double sum=0;
        for (LineItem d:lineItemArrayList) {
            sum +=d.cost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Customer Name: \n"+customerName.toString() +"\ntransactionTime: \n"+transactionTime.toString()+lineItemArrayList.toString();
    }

}
