package id.ac.polinema.aplikasi_msi.Model;

public class ListMenu {
    public String img;
    public String judul;
    public String des;

    public ListMenu(String img, String judul, String des) {
        this.img = img;
        this.judul = judul;
        this.des = des;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
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
}
