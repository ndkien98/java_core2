package testAdapter.adapter2;

public class Senmail implements ISendInformation {
    @Override
    public void send() {
        System.out.printf("Send mail day");
    }
}
