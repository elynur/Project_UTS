package id.ac.polinema.aplikasi_msi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    public void handleHome (View view){
        Intent intent = new Intent(CartActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void handleMenu (View view){
        Intent intent = new Intent(CartActivity.this, OrderActivity.class);
        startActivity(intent);
    }

    public void handleCart (View view){
        Intent intent = new Intent(CartActivity.this, CartActivity.class);
        startActivity(intent);
    }
}
