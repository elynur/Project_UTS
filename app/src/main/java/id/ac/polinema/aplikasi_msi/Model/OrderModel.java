package id.ac.polinema.aplikasi_msi.Model;

public class OrderModel {
    public String title;
    public int harga;
    public  int totalOrder;
    public int jumlahPesanan, image;
    public String desc;
    public String key;

    public OrderModel(String title, int harga, int totalOrder, int jumlahPesanan, int image, String desc, String key) {
        this.title = title;
        this.harga = harga;
        this.totalOrder = totalOrder;
        this.jumlahPesanan = jumlahPesanan;
        this.image = image;
        this.desc = desc;
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public int getJumlahPesanan() {
        return jumlahPesanan;
    }

    public void setJumlahPesanan(int jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
