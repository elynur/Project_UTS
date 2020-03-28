package id.ac.polinema.aplikasi_msi.Model;

public class MenuModels {
    public int img;
    public String judul;
    public String des;
    public String harga;

    public MenuModels(int img, String judul, String des, String harga) {
        this.img = img;
        this.judul = judul;
        this.des = des;
        this.harga = harga;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
