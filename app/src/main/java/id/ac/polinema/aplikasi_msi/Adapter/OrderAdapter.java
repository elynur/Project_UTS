package id.ac.polinema.aplikasi_msi.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.aplikasi_msi.Fragment.CartFragment;
import id.ac.polinema.aplikasi_msi.Interface.ItemClickListener;
import id.ac.polinema.aplikasi_msi.MainActivity;
import id.ac.polinema.aplikasi_msi.Model.OrderModels;
import id.ac.polinema.aplikasi_msi.R;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {
    public List<OrderModels> data;
    LayoutInflater layoutInflater;
    Context c;

    private int order = 0;

    public OrderAdapter(Context c, List<OrderModels> data) {
        this.data = data;
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_order,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final OrderModels menuModels = data.get(position);

        holder.imGetData.setImageResource(menuModels.getgImg());
        holder.titleGetData.setText(menuModels.getgTitle());
        holder.hargaGetData.setText(String.valueOf(menuModels.getgHarga()));
        holder.rpGetData.setText("Rp. ");
        holder.orderDet.setText(String.valueOf(order));
        holder.descGet.setText(menuModels.getgDesc());

        final Bundle bundle = new Bundle();
        final CartFragment fragment = new CartFragment();

        holder.incOrdered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order += 1;
                holder.orderDet.setText(String.valueOf(order));
            }
        });
        holder.decOrdered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                order -= 1;
                if(order == 0 || order < 0) {
                    order = 0;
                }
                holder.orderDet.setText(String.valueOf(order));
            }
        });

        holder.orderedOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(order != 0){
                    //ni buat apa
                    MainActivity act = (MainActivity) v.getContext();
                    FragmentTransaction fragmentTransaction = act.getSupportFragmentManager().beginTransaction();
                    bundle.putString("title",menuModels.getgTitle());
                    fragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.changeFrame, fragment);
                    fragmentTransaction.commit();
                }
                else{
                    Toast.makeText(c,"Order Minimal 1 Item",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return (data != null) ? data.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView titleGetData, hargaGetData, rpGetData, descGet;
        public ImageView imGetData;
        public EditText orderDet;
        public Button incOrdered, decOrdered, orderedOkay;
        ItemClickListener itemClickListener;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleGetData = itemView.findViewById(R.id.titleGet);
            hargaGetData = itemView.findViewById(R.id.hargaGet);
            imGetData = itemView.findViewById(R.id.imageGet);
            rpGetData = itemView.findViewById(R.id.rpGet);
            incOrdered = itemView.findViewById(R.id.btnPlus);
            decOrdered = itemView.findViewById(R.id.btnMinus);
            orderDet = itemView.findViewById(R.id.textGet);
            descGet = itemView.findViewById(R.id.descGet);
            orderedOkay = itemView.findViewById(R.id.btnOrder);

            itemView.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            this.itemClickListener.onItemClick(view,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic){
            this.itemClickListener = ic;
        }
        }
}
