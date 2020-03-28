package id.ac.polinema.aplikasi_msi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.aplikasi_msi.Interface.ItemClickListener;
import id.ac.polinema.aplikasi_msi.Model.MenuModels;
import id.ac.polinema.aplikasi_msi.R;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    public List<MenuModels> data;
    LayoutInflater layoutInflater;
    Context c;

    public MenuAdapter(Context c,List<MenuModels> data) {
        this.data = data;
        this.c = c;
        this.layoutInflater = LayoutInflater.from(this.c);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_menu,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuModels menuModels = data.get(position);

        holder.imItemName.setImageResource(menuModels.getImg());
        holder.titleItemName.setText(menuModels.getJudul());
        holder.descItemName.setText(menuModels.getDes());
        holder.priceItemName.setText(menuModels.getHarga());


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return (data != null) ? data.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView titleItemName, descItemName, priceItemName;
        public ImageView imItemName;
        ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleItemName = itemView.findViewById(R.id.titleView);
            descItemName = itemView.findViewById(R.id.descView);
            imItemName = itemView.findViewById(R.id.imageView);
            priceItemName = itemView.findViewById(R.id.priceView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            this.itemClickListener.onItemClick(v,getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }
    }
}
