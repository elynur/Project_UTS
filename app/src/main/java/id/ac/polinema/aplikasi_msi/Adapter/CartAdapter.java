package id.ac.polinema.aplikasi_msi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.aplikasi_msi.Model.CartModels;
import id.ac.polinema.aplikasi_msi.R;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    public List<CartModels> data;
    LayoutInflater layoutInflater;
    Context c;

    public CartAdapter(Context c, List<CartModels> data) {
        this.data = data;
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_cart,parent,false);
        return new CartAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {
        final CartModels cartModels = data.get(position);
        final int sum = 0;

        holder.titleOrder.setText(cartModels.getTitle());
        holder.imgOrder.setImageResource(cartModels.getImage());
        holder.descOrder.setText(cartModels.getDesc());
        holder.hargaOrder.setText(String.valueOf(cartModels.getHarga()));
        holder.textOrder.setText(String.valueOf(cartModels.getJumlahPesanan()));
        holder.totalOrderHarga.setText(String.valueOf(cartModels.getTotalOrder()));
    }

    @Override
    public int getItemCount() {
        return (data != null) ? data.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleOrder , descOrder , hargaOrder ,totalOrderHarga;
        public ImageView imgOrder;
        public EditText textOrder;
        public Button btnCancelOrder, btnMinusOr, btnPlusOr;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleOrder = itemView.findViewById(R.id.titleOrdered);
            imgOrder = itemView.findViewById(R.id.imageOrdered);
            descOrder = itemView.findViewById(R.id.descOrdered);
            hargaOrder = itemView.findViewById(R.id.hargaOrdered);
            textOrder = itemView.findViewById(R.id.textOrdered);
            totalOrderHarga = itemView.findViewById(R.id.totalOrderProc);
            btnCancelOrder = itemView.findViewById(R.id.btnDelOrder);
            btnMinusOr = itemView.findViewById(R.id.btnMinusOrdered);
            btnPlusOr = itemView.findViewById(R.id.btnPlusOrdered);
        }
    }
}
