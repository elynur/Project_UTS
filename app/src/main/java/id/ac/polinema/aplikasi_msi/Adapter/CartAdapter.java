package id.ac.polinema.aplikasi_msi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.aplikasi_msi.Model.CartModels;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    public List<CartModels> data;
    LayoutInflater layoutInflater;
    Context c;

    public CartAdapter(List<CartModels> data, LayoutInflater layoutInflater, Context c) {
        this.data = data;
        this.layoutInflater = layoutInflater;
        this.c = c;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
