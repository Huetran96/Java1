package TestJava1;

public class DeliveryOder extends Order{
    String address;
    public DeliveryOder(){

    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer Name: \n"+customerName.toString() +"Address: \n"+address.toString()+"\ntransactionTime: \n"+transactionTime.toString()+lineItemArrayList.toString();
    }
}
