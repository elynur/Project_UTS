package id.ac.polinema.aplikasi_msi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.aplikasi_msi.Fragment.CartFragment;
import id.ac.polinema.aplikasi_msi.Fragment.HomeFragment;
import id.ac.polinema.aplikasi_msi.Fragment.MenuFragment;
import id.ac.polinema.aplikasi_msi.Model.Session;

public class MainActivity extends AppCompatActivity {

    private Session session;

    //Deklarasi fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        session = Application.getSession();
        session = new Session(this);
        //logika untuk mengatur apabila telah ada session maka tidak diperlukan untuk melakukan login
        if (!session.isLoggedIn()) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.changeFrame,new HomeFragment());
        fragmentTransaction.commit();
    }

    public void handleHome(View view) {
        Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.changeFrame,new HomeFragment());
        fragmentTransaction.commit();
    }

    public void handleMenu(View view) {
        Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.changeFrame,new MenuFragment());
        fragmentTransaction.commit();
    }

    public void handleCart(View view) {
        Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.changeFrame,new CartFragment());
        fragmentTransaction.commit();
    }

}
