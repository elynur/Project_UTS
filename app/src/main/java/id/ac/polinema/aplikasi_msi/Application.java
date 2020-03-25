package id.ac.polinema.aplikasi_msi;

import id.ac.polinema.aplikasi_msi.Model.Session;

public class Application extends android.app.Application {
    private static Session session;

    @Override
    public void onCreate() {
        super.onCreate();
        session = new Session(this);
    }
    public static Session getSession(){
        return session;
    }
}
