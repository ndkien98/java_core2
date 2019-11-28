package testAdapter.adapter2;

public class Order implements IOrder {

    private String data;

    public void processData(ISaveInformation saveInformation){
        saveInformation.save(data);
    }

    public Order(String s){
        data=s;
    }

    public static void main(String[] args) {

        Order order = new Order("du lieu mau");
        order.processData(new SaveStorage());

        System.out.printf("Sao ma");


    }

    @Override
    public void ghiDuLieu() {

    }

    @Override
    public void guiMail() {

    }
}
