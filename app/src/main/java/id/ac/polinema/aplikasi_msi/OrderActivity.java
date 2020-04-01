package id.ac.polinema.aplikasi_msi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.aplikasi_msi.Adapter.OrderAdapter;
import id.ac.polinema.aplikasi_msi.Model.OrderModels;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        RecyclerView recyclerView = findViewById(R.id.rv_order);
        List<OrderModels> order = new ArrayList<>();
        OrderModels or = new OrderModels(R.drawable.aloevera,80000 ,"Aloevera","Produk kecantikan");
        order.add(or);
        or = new OrderModels(R.drawable.lotion,100000 ,"Lotion","Produk Kecantikan");
        order.add(or);
        or = new OrderModels(R.drawable.facemist,85000 ,"Facemist","Produk Kecantikan dan Kesehatan");
        order.add(or);
        or = new OrderModels(R.drawable.gartea,10000 ,"Gartea","Produk Kesehatan");
        order.add(or);
        or = new OrderModels(R.drawable.bambo,40000 ,"Bamboo ","Produk Kecantikan dan Kesehatan");
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
}
