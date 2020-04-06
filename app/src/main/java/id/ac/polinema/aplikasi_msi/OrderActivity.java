package id.ac.polinema.aplikasi_msi;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.aplikasi_msi.Adapter.OrderAdapter;
import id.ac.polinema.aplikasi_msi.Model.OrderModels;
import id.ac.polinema.aplikasi_msi.Model.Session;

public class OrderActivity extends AppCompatActivity {
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        session = new Session(this);
        //logika untuk mengatur apabila telah ada session maka tidak diperlukan untuk melakukan login
        if (!session.isLoggedIn()) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        RecyclerView recyclerView = findViewById(R.id.rv_order);
        List<OrderModels> order = new ArrayList<>();
        OrderModels or = new OrderModels(R.drawable.aloevera,80000 ,"Aloevera","Produk kecantikan");
        order.add(or);
        or = new OrderModels(R.drawable.lotion,100000 ,"Lotion","Produk Kecantikan");
        order.add(or);
        or = new OrderModels(R.drawable.facemist,60000 ,"Facemist","Produk Kecantikan dan Kesehatan");
        order.add(or);
        or = new OrderModels(R.drawable.gartea,10000 ,"Gartea","Produk Kesehatan");
        order.add(or);
        or = new OrderModels(R.drawable.bambo,40000 ,"Bamboo ","Produk Kecantikan dan Kesehatan");
        order.add(or);
        or = new OrderModels(R.drawable.simapro,90000 ,"Simapro","Produk Kesehatan ");
        order.add(or);
        or = new OrderModels(R.drawable.lips,70000,"Lip Cream ","Produk Kecantikan");
        order.add(or);
        or = new OrderModels(R.drawable.mahkotaraya,100000,"Mahkota Raya ","Produk Kesehatan");
        order.add(or);

        OrderAdapter adapter = new OrderAdapter(this, order);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void handleHome (View view){
        Intent intent = new Intent(OrderActivity.this, MainActivity.class);
        startActivity(intent);

    }

    public void handleMenu (View view){
        Intent intent = new Intent(OrderActivity.this, OrderActivity.class);
        startActivity(intent);

    }

    public void handleCart (View view){
        Intent intent = new Intent(OrderActivity.this, CartActivity.class);
        startActivity(intent);

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
