package ColectionVSMang.TesrComparable;

public class NhanVien {

    int id;
    String name;

    public NhanVien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public NhanVien() {
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
