package id.ac.polinema.aplikasi_msi.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Cart implements Parcelable {
    public String title;
    public int harga;
    public  int totalOrder;
    public int jumlahPesanan, image;
    public String desc;

    public Cart() {
    }

    public Cart(String title, int harga, int totalOrder, int jumlahPesanan, int image, String desc) {
        this.title = title;
        this.harga = harga;
        this.totalOrder = totalOrder;
        this.jumlahPesanan = jumlahPesanan;
        this.image = image;
        this.desc = desc;
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

    public static Creator<Cart> getCREATOR() {
        return CREATOR;
    }

    protected Cart(Parcel in) {
        title = in.readString();
        harga = in.readInt();
        totalOrder = in.readInt();
        jumlahPesanan = in.readInt();
        image = in.readInt();
        desc = in.readString();
    }

    public static final Creator<Cart> CREATOR = new Creator<Cart>() {
        @Override
        public Cart createFromParcel(Parcel in) {
            return new Cart(in);
        }

        @Override
        public Cart[] newArray(int size) {
            return new Cart[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeInt(harga);
        dest.writeInt(totalOrder);
        dest.writeInt(jumlahPesanan);
        dest.writeInt(image);
        dest.writeString(desc);
    }
}
