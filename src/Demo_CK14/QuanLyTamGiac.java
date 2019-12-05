package Demo_CK14;

public class QuanLyTamGiac {

    int soTamGiac;
    TamGiac [] listTamGiac;

    public QuanLyTamGiac(int soTamGiac){
        this.soTamGiac = soTamGiac;
        this.listTamGiac = new TamGiac[this.soTamGiac];
    }

    public void NhapTTListTamGiac(){
        System.out.printf("\nNhap thong tin cac tam giac");
        System.out.printf("\n");
        for (int i=0;i<this.soTamGiac;i++){
            TamGiac tamGiac = new TamGiac();
            tamGiac.nhapTTCacCanh();
            this.listTamGiac[i] = tamGiac;
        }
    }

    public void InTTListTamGiac(){
        System.out.printf("\nThong tin cac tam giac\n ");
        for (int i=0;i<this.soTamGiac;i++){
            this.listTamGiac[i].inSoCanh();
            if (i==this.soTamGiac-1){
                System.out.printf("\nTam giac tiep theo");
            }
        }
    }

    public int TimTamGiacCoChuViLonNhat(){
        System.out.printf("\nThong tin tam giac co chu vi lon nhat\n");
        int tamGiacThu = 0;
        for (int i=0;i<this.soTamGiac;i++){
            for (int j=i+1;j<this.soTamGiac;j++){
                if (this.listTamGiac[i].tinhChuVi()<this.listTamGiac[j].tinhChuVi()){
                    tamGiacThu=j;
                }else {
                    tamGiacThu=i;
                }
            }
        }
        return tamGiacThu;
    }

    public void inTTTamGiacChuViMax(){
        System.out.printf("\ntam giac co chu vi lon nhat");
        this.listTamGiac[this.TimTamGiacCoChuViLonNhat()].inSoCanh();
    }



}
