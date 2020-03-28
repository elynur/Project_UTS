package id.ac.polinema.aplikasi_msi;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import id.ac.polinema.aplikasi_msi.Fragment.CartFragment;
import id.ac.polinema.aplikasi_msi.Fragment.HomeFragment;
import id.ac.polinema.aplikasi_msi.Fragment.MenuFragment;
import id.ac.polinema.aplikasi_msi.Model.Session;

public class MainActivity extends AppCompatActivity {
    private Session session;
    private String usernameValue;
    Intent i;
    Bundle bundle;
    HomeFragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//          session = Application.getSession();
            session = new Session(this);

            //Bundle untuk mengirim data dari activity ke fragment
            bundle = new Bundle();

            //Buat ngambil data dr activity
            i = getIntent();
            //Mengisi username value dengan data dari Intent
            usernameValue = i.getStringExtra("username");

            //logika untuk mengatur apabila telah ada session maka tidak diperlukan untuk melakukan login
            if (!session.isLoggedIn()) {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            //Deklarasi fragment home
            fragment = new HomeFragment();
            //Mengirim data ke fragment
            bundle.putString("username",usernameValue);
            //Untuk mengirim data bundle ke fragment
            fragment.setArguments(bundle);
            fragmentTransaction.replace(R.id.changeFrame, fragment);
            fragmentTransaction.commit();
        }

        public void handleHome (View view){
            Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
            //Memulai sebuah fragment
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragment.setArguments(bundle);
            fragmentTransaction.replace(R.id.changeFrame, fragment);
            fragmentTransaction.commit();
        }

        public void handleMenu (View view){
            Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.changeFrame, new MenuFragment());
            fragmentTransaction.commit();
        }

        public void handleCart (View view){
            Fragment fragmentManager = getSupportFragmentManager().findFragmentById(R.id.changeFrame);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.changeFrame, new CartFragment());
            fragmentTransaction.commit();
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (@NonNull MenuItem item){
            int id = item.getItemId();

            if (id == R.id.action_settings) {
                Intent intent = new Intent(this, SettingActivity.class);
                startActivity(intent);
                return true;
            } else if (id == R.id.action_logout) {
                session.logout();
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                return true;
            }
            return false;
        }
    }
