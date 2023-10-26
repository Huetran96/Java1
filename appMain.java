package TestJava1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class appMain {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd H:i:s");
        Product p1 = new Product("F523","Tomato","Food",1.5f,589);
        Product p2 = new Product("A763","Zara Shirt", "Appearence", 12,90);
        Product p3 = new Product("H320","Kitchen Table","Househole",299,13);
        Product p4 = new Product("E092","Iphone","Electrnic", 1000,4);
        Product p5 = new Product("S108","Football","Sport",19.9f,2);
        Order order1 = new Order();
        order1.setCustomerName("Mike Tyson");
        try {
            order1.setTransactionTime(df.parse("2023-08-08 11:30:00"));
        }catch (ParseException e){

        }
        order1.addProduct(p1,5);
        order1.addProduct(p4,2);
        order1.addProduct(p5,4);
        System.out.println(order1);

        DeliveryOder Dorder = new DeliveryOder();
        Dorder.setAddress("123 Cau Giay");
        Dorder.addProduct(p2,3);
        Dorder.addProduct(p4,3);
        System.out.println(Dorder);


    }
}
