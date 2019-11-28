package testAdapter.adapter2;

public class SaveStorage implements ISaveInformation {
    @Override
    public void save(String data) {
        System.out.printf("sava to disk"+data);
    }
}
